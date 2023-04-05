package com.acmday.hexagonal.architecture.demo.common.enums;

/**
 * @author acmday
 * @date 2023/4/5 上午12:15
 */
public enum ConsumeStatus {

    CONSUME_SUCCESS(0, "SUCCESS"),
    RECONSUME_LATER(1, "LATER"),
    CONSUME_FAILURE(2, "FAILURE");

    private int index;

    private String name;

    private ConsumeStatus(int index, String name) {
        this.index = index;    this.name = name;
    }

    public int getIndex() {
        return this.index;
    }

    public String getName() {
        return this.name;
    }
}
