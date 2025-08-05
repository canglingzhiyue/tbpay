package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import tb.eyx;
import tb.ezm;
import tb.kge;

/* loaded from: classes5.dex */
public class s implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DETAIL_COMMENT_FRAGMENT_TAG = "DetailCommentFragment";
    public static final String EVENT_TYPE = "openRate";
    public static final String EVENT_TYPE_ALTERNATIVE = "open_rate";

    /* renamed from: a  reason: collision with root package name */
    private Context f10723a;
    private eyx b;

    static {
        kge.a(1293436209);
        kge.a(1967244270);
    }

    public s(Context context, eyx eyxVar) {
        this.f10723a = context;
        this.b = eyxVar;
    }

    @Override // tb.ezm
    public boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        Toast.makeText(this.f10723a, "please implement rate", 0).show();
        return true;
    }
}
