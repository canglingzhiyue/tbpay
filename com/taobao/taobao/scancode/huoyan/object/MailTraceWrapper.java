package com.taobao.taobao.scancode.huoyan.object;

import com.etao.kakalib.express.ExpressResult;
import java.io.Serializable;
import java.util.ArrayList;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class MailTraceWrapper implements Serializable, IMTOPDataObject {
    private static final long serialVersionUID = 2618578177710871925L;
    private ArrayList<ExpressResult> traces;

    static {
        kge.a(-793207103);
        kge.a(1028243835);
        kge.a(-350052935);
    }

    public ArrayList<ExpressResult> getTraces() {
        return this.traces;
    }

    public void setTraces(ArrayList<ExpressResult> arrayList) {
        this.traces = arrayList;
    }
}
