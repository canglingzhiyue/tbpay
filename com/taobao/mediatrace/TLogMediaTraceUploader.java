package com.taobao.mediatrace;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.olo;
import tb.olp;
import tb.olr;

/* loaded from: classes.dex */
public class TLogMediaTraceUploader implements olo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BIZ_CODE = "taobao_video_zip_21646297";

    static {
        kge.a(-407881254);
        kge.a(995465610);
    }

    @Override // tb.olo
    public void executeUploadTask(Context context, olr olrVar, olp olpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca35e6fe", new Object[]{this, context, olrVar, olpVar});
        }
    }

    @Override // tb.olo
    public String getBizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("826ffbcf", new Object[]{this}) : BIZ_CODE;
    }

    @Override // tb.olo
    public void onUploadDone(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca026d15", new Object[]{this, new Boolean(z), str});
        }
    }
}
