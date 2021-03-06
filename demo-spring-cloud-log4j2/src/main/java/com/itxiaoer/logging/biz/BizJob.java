package com.itxiaoer.logging.biz;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author : liuyk
 */
@Slf4j
@Component
public class BizJob {

    /**
     * 2秒钟执行1次
     */
    @Scheduled(fixedRate = 2 * 1000)
    public void logging() {
        String now = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm").format(LocalDateTime.now());
        log.trace(now);
        log.debug(now);
        log.info(now);
        log.debug(now);
        log.error(now);

    }

}
