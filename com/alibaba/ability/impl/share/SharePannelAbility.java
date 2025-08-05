package com.alibaba.ability.impl.share;

import android.app.Activity;
import android.content.Context;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsSharePannelAbility;
import com.taobao.android.abilityidl.ability.cp;
import com.taobao.android.abilityidl.ability.ee;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareBusinessListener;
import com.ut.share.business.ShareContent;
import com.ut.share.business.ShareTargetType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.als;
import tb.kge;

/* loaded from: classes2.dex */
public final class SharePannelAbility extends AbsSharePannelAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    static {
        kge.a(624044876);
        Companion = new a(null);
    }

    /* loaded from: classes2.dex */
    public static final class a {
        static {
            kge.a(-366123116);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsSharePannelAbility
    public void open(als abilityContext, ee params, cp events) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c3ccb56", new Object[]{this, abilityContext, params, events});
            return;
        }
        q.d(abilityContext, "abilityContext");
        q.d(params, "params");
        q.d(events, "events");
        Context f = abilityContext.f().f();
        if (!(f instanceof Activity)) {
            f = null;
        }
        Activity activity = (Activity) f;
        if (activity == null) {
            events.a(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (o) null));
            return;
        }
        ShareContent shareContent = new ShareContent();
        shareContent.businessId = params.f8837a;
        shareContent.title = params.c;
        shareContent.description = params.d;
        shareContent.imageUrl = params.e;
        shareContent.url = params.b;
        shareContent.templateParams = params.f;
        b bVar = new b(events);
        List<String> list = params.h;
        if (list != null) {
            ShareBusiness.share(activity, new ArrayList(list), shareContent, bVar);
        } else {
            ShareBusiness.share(activity, shareContent, bVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements ShareBusinessListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cp f1960a;

        @Override // com.ut.share.business.ShareBusinessListener
        public void onShare(ShareContent shareContent, ShareTargetType shareTargetType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a481375", new Object[]{this, shareContent, shareTargetType});
            }
        }

        public b(cp cpVar) {
            this.f1960a = cpVar;
        }

        @Override // com.ut.share.business.ShareBusinessListener
        public void onFinished(Map<String, String> map) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff43b50d", new Object[]{this, map});
                return;
            }
            if (map == null || (str = map.get("platform")) == null) {
                str = "unknown";
            }
            String str2 = map != null ? map.get(com.taobao.mtop.wvplugin.a.RESULT_KEY) : null;
            if (str2 == null) {
                return;
            }
            int hashCode = str2.hashCode();
            if (hashCode == -1867169789) {
                if (!str2.equals("success")) {
                    return;
                }
                this.f1960a.a(str);
            } else if (hashCode == -1367724422) {
                if (!str2.equals("cancel")) {
                    return;
                }
                this.f1960a.c(str);
            } else if (hashCode != 3135262 || !str2.equals("fail")) {
            } else {
                this.f1960a.b(str);
            }
        }
    }
}
