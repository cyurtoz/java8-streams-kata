import com.SongService;
import org.junit.Before;

import java.util.Collections;

public class SongServiceTest {

    private SongService songService;

    @Before
    public void setUp() throws Exception {
        songService = new SongService(Collections.emptyList());
    }
}
