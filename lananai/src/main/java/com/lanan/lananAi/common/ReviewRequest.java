package com.lanan.lananAi.common;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
public class ReviewRequest implements Serializable {

    /**
     * id
     */
    private Long id;


    /**
     * 审核状态：0-待审核, 1-通过, 2-拒绝
     */
    private Integer reviewStatus;

    /**
     * 审核信息
     */
    private String reviewMessage;




    private static final long serialVersionUID = 1L;
}