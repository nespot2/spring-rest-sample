package com.nespot2.springrestsample;

import com.nespot2.springrestsample.common.domain.YesNo;
import com.nespot2.springrestsample.item.domain.Item;
import com.nespot2.springrestsample.item.domain.ItemCategory;
import com.nespot2.springrestsample.item.repository.ItemCategoryRepository;
import com.nespot2.springrestsample.item.repository.ItemRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootTest(classes = {SpringRestSampleApplication.class})
@RunWith(SpringRunner.class)
@ActiveProfiles("local")
public class SpringRestSampleApplicationTest {

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private ItemCategoryRepository itemCategoryRepository;

    @Test
    @Transactional
    @Rollback(value = false)
    public void test(){
        final ItemCategory itemCategory = ItemCategory.builder()
                .name("책")
                .modifiedAt(OffsetDateTime.now())
                .createdAt(OffsetDateTime.now())
                .build();

        itemCategoryRepository.save(itemCategory);
    }
    @Test
    @Transactional
    @Rollback(value = false)
    public void test2(){
        final Optional<ItemCategory> itemCategory = itemCategoryRepository.findById(1l);


        final List<String> strings = Arrays.asList("스프링", "자바", "react", "docker", "elasticsearch", "linux", "window");

        for(int i=0; i<100; i++){

            final String name = strings.get(i % 7);

            final Item item = Item.builder()
                    .name(name + i)
                    .modifiedAt(OffsetDateTime.now())
                    .createdAt(OffsetDateTime.now())
                    .imageUrl("")
                    .quickDeliveryYn(YesNo.YES)
                    .inventoryQuantity(0)
                    .releasedQuantity(0)
                    .initQuantity(100)
                    .itemCategory(itemCategory.get())
                    .build();
            itemRepository.save(item);
        }



    }
}