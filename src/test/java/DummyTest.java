import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DummyTest {

    @Test
    public void true_isTrue() {
        assertTrue(true);
    }

    @Test
    public void defaultMock_returnsDefaultValue() {
        var mockedInterface = mock(DummyInterface.class);
        assertNotNull(mockedInterface);
        assertEquals(0, mockedInterface.getValue());
    }

    @Test
    public void configuredMock_returnsConfiguredValue() {
        var mockedInterface = mock(DummyInterface.class);
        when(mockedInterface.getValue()).thenReturn(42);
        assertEquals(42, mockedInterface.getValue());
    }
}