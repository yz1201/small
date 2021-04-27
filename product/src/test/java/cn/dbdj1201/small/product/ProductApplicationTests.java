package cn.dbdj1201.small.product;

import cn.dbdj1201.small.product.entity.BrandEntity;
import cn.dbdj1201.small.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductApplicationTests {
    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity entity = new BrandEntity();
        entity.setLogo("ha ha");
        entity.setDescript("o ho");
        entity.setFirstLetter("F");
        entity.setName("test-1");
        entity.setSort(1);
        entity.setShowStatus(2);
        this.brandService.save(entity);
    }

}
