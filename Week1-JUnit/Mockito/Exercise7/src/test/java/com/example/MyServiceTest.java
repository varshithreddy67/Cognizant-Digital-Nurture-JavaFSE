package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;

public class MyServiceTest {

    @Test
    void testVoidMethodThrowsException() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        doThrow(new RuntimeException("API Error"))
                .when(mockApi)
                .sendData("Invalid Data");

        MyService service = new MyService(mockApi);

        assertThrows(RuntimeException.class, () -> {
            service.processData("Invalid Data");
        });

        verify(mockApi).sendData("Invalid Data");
    }
}