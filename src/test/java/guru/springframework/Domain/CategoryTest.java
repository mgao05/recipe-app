package guru.springframework.Domain;

import org.junit.Before;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class CategoryTest {
    Category category;

    @Before
    public void setUp(){
        category = new Category();
    }

    @Test
    public void getId(){
        Long idValue = 4L;
        category.setId(idValue);
        assertEquals(idValue,category.getId());
    }

    @Test
    public void getDescription() throws Exception{
    }

    @Test
    public void getRecipies() throws Exception{
    }
}