package com.taobao.detail.domain.control;

import com.taobao.detail.domain.component.Button;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class WaitingControl implements Serializable {
    public List<Button> buttons;
    public boolean remindSupport;
    public long waitingTime;
    public String waitingTitle;

    static {
        kge.a(-688576894);
        kge.a(1028243835);
    }
}
