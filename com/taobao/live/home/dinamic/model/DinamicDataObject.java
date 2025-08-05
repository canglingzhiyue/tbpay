package com.taobao.live.home.dinamic.model;

import com.alibaba.fastjson.JSONObject;
import java.util.HashMap;
import mtopsdk.mtop.domain.IMTOPDataObject;

/* loaded from: classes7.dex */
public class DinamicDataObject implements IMTOPDataObject {
    public HashMap<String, JSONObject> data;
    public String mChannelId;
    public String mChannelType;
    public int mPosition;
    public boolean mShowUtParam;
    public boolean noBottomSpace;
    public boolean noLeftRightSpace;
    public boolean noNeedSetPlayOnce;
    public boolean playOnce = false;
    public boolean postMaidian = true;
    public String templateName;
    public String type;
}
