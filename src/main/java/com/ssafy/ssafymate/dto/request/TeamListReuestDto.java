package com.ssafy.ssafymate.dto.request;

import com.ssafy.ssafymate.entity.TeamStack;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class TeamListReuestDto {
    @ApiModelProperty(value = "프로젝트", example = "특화 프로젝트")
    private String project;

    @ApiModelProperty(value = "프로젝트 트랙", example = "IoT")
    private String projectTrack;

    @ApiModelProperty(value = "기술 스택")
    List<TeamStack> techStacks = new ArrayList<>();

    @ApiModelProperty(value = "팀 이름", example = "우수상")
    private String teamName;

    @ApiModelProperty(value = "희망 직무", example = "프론트엔드(Front-end)")
    private String job;

}
