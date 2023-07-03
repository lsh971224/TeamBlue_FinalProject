package com.blue.bluearchive.admin.dto;

import com.blue.bluearchive.constant.MemberStat;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class AdminMemberStateDto {
    List<MemberStat> memberStats = new ArrayList<>();
}
