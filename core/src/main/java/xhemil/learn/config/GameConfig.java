package xhemil.learn.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import xhemil.learn.GuessCount;
import xhemil.learn.MaxNumber;
import xhemil.learn.MinNumber;

@Configuration
@ComponentScan("xhemil.learn")
@PropertySource("classpath:config/game.properties")
public class GameConfig {

    @Value("${game.maxNumber:20}")
    private int maxNumber;

    @Value("${game.guessCount:5}")
    private int guessCount;

    @Value("${game.minNumber:1}")
    private int minNumber;

    @Bean
    @MaxNumber
    public int maxNumber(){
        return maxNumber;
    }

    @Bean
    @GuessCount
    public int guessCount(){
        return guessCount;
    }

    @Bean
    @MinNumber
    public int minNumber(){
        return minNumber;
    }
}
