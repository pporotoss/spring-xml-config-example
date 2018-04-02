package soundsystem;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class) // junit이 실행될때 내부적으로 ApplicationContext를 생성한다.
@ContextConfiguration // ApplicationContext가 생성될 때, 기본값으로 클래스이름-context.xml 파일을 읽어들인다.
public class CNamespaceReferenceTest {
  
  @Rule
  public final StandardOutputStreamLog log = new StandardOutputStreamLog(); // System.out 으로 출력한 결과를 가질 수 있는 객체

  @Autowired
  private MediaPlayer player;
  
  
  @Test
  public void notNull() {
    assertNotNull(player);
  }
  
  @Test
  public void play() {
    player.play();
    assertEquals(
        "Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\r\n",
        log.getLog());
  }

}
