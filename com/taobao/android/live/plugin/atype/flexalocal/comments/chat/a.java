package com.taobao.android.live.plugin.atype.flexalocal.comments.chat;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import tb.ddu;
import tb.kge;

/* loaded from: classes5.dex */
public class a implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ANCHOR_RESPONSE_VIEW = "ChatBottomPriority.anchor_response";
    public static final String KEY_BOTTOM_ADAPTER_VIEW = "ChatBottomPriority.bottom_adapter";
    public static final String KEY_HOT_SALE_VIEW = "ChatBottomPriority.hot_sale";
    public static final String KEY_SAYS_CLUSTER_VIEW = "ChatBottomPriority.says_cluster";

    /* renamed from: a  reason: collision with root package name */
    private final com.taobao.alilive.aliliveframework.frame.a f13609a;
    private final HashMap<String, Boolean> b = new HashMap<>();
    private final List<String> c = Arrays.asList(KEY_ANCHOR_RESPONSE_VIEW, KEY_SAYS_CLUSTER_VIEW, KEY_HOT_SALE_VIEW, KEY_BOTTOM_ADAPTER_VIEW);

    static {
        kge.a(1455633455);
        kge.a(876895720);
    }

    public a(com.taobao.alilive.aliliveframework.frame.a aVar) {
        this.f13609a = aVar;
        for (String str : this.c) {
            this.b.put(str, false);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.c
    public void a(String str, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86f9e1db", new Object[]{this, str, bool});
            return;
        }
        this.b.put(str, bool);
        com.taobao.alilive.aliliveframework.frame.a aVar = this.f13609a;
        if (aVar == null) {
            return;
        }
        ddu e = aVar.e();
        String bool2 = bool.toString();
        com.taobao.alilive.aliliveframework.frame.a aVar2 = this.f13609a;
        e.a(str, bool2, aVar2 == null ? null : aVar2.G());
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.comments.chat.c
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (!b.i()) {
            return true;
        }
        for (String str2 : this.c) {
            if (TextUtils.equals(str, str2)) {
                return true;
            }
            if (this.b.get(str2) == Boolean.TRUE) {
                break;
            }
        }
        return false;
    }
}
