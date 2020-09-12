package test;

import be.travexpense.beans.Price;
import be.travexpense.controllers.PriceController;
import be.travexpense.repositories.PriceRepository;
import be.travexpense.services.PriceServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.when;

@WebMvcTest(PriceController.class)
public class PriceControllerTEST {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PriceServiceImpl service;

    @Test
    public void test() throws Exception {
        Object mock = when(service.getAll()).thenReturn(Collections.singletonList(new Price())).getMock();
        mock.toString();

    }
}

