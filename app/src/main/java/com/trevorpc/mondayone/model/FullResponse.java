package com.trevorpc.mondayone.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FullResponse {

    @SerializedName("message")
    @Expose
    public String message;
    @SerializedName("request")
    @Expose
    public Request request;
    @SerializedName("response")
    @Expose
    public List<Response> response = null;



}