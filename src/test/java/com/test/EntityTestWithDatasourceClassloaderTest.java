package com.test;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {EmbeddedDatabaseConfig.class, JpaConfigWithDatasourceClassloader.class})
public class EntityTestWithDatasourceClassloaderTest {
    @Inject
    private TestRepository testRepository;

    @Test
    public void test() {
        BaseEntity entity = new BaseEntity();
        testRepository.save(entity);
    }
}