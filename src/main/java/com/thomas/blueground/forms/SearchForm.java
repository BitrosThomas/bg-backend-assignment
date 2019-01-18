package com.thomas.blueground.forms;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class SearchForm {

    private static final String TEXT_PATTERN = "^[a-zA-Z0-9 ]+$";

    @Pattern(regexp = TEXT_PATTERN, message = "Wrong Input")
    @NotNull(message = "Empty field")
    private String title;

    @Pattern(regexp = TEXT_PATTERN, message = "Wrong Input")
    @NotNull(message = "Empty field")
    private String region;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
