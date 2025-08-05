package com.taobao.android.interactive_sdk.share;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareBusinessListener;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes5.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Activity f12960a;
    private final ShareBusinessListener b = new ShareBusinessListener() { // from class: com.taobao.android.interactive_sdk.share.c.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.ut.share.business.ShareBusinessListener
        public void onShare(com.ut.share.business.ShareContent shareContent, com.ut.share.business.ShareTargetType shareTargetType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a481375", new Object[]{this, shareContent, shareTargetType});
            } else if (c.a(c.this) == null) {
            } else {
                c.a(c.this);
                shareTargetType.toString();
            }
        }

        @Override // com.ut.share.business.ShareBusinessListener
        public void onFinished(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff43b50d", new Object[]{this, map});
            } else if (c.a(c.this) == null) {
            } else {
                c.a(c.this).a(map);
                c.a(c.this, null);
            }
        }
    };
    private a c;

    public static /* synthetic */ a a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("6e830290", new Object[]{cVar}) : cVar.c;
    }

    public static /* synthetic */ a a(c cVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("7a7c6cd", new Object[]{cVar, aVar});
        }
        cVar.c = aVar;
        return aVar;
    }

    public c(Activity activity) {
        this.f12960a = activity;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.c = null;
        }
    }

    public void a(b bVar, String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13aaa4d7", new Object[]{this, bVar, str, aVar});
            return;
        }
        com.ut.share.business.ShareContent shareContent = new com.ut.share.business.ShareContent();
        shareContent.title = bVar.f12959a;
        shareContent.description = bVar.b;
        shareContent.imageUrl = bVar.c;
        shareContent.url = bVar.d;
        shareContent.businessId = bVar.e;
        shareContent.wwMsgType = bVar.f;
        shareContent.disableBackToClient = false;
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        this.c = aVar;
        ShareBusiness.share(this.f12960a, arrayList, shareContent, this.b);
    }
}
