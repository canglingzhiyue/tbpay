package com.alibaba.security.realidentity.service.camera;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class PreviewSize implements Serializable {
    @JSONField(name = "height")
    public int height;
    @JSONField(name = "width")
    public int width;
}
