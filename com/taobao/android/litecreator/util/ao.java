package com.taobao.android.litecreator.util;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.FileBean;
import com.taobao.android.litecreator.base.data.IUGCMedia;
import com.taobao.android.litecreator.base.data.ImageBean;
import com.taobao.android.litecreator.base.data.UGCImage;
import com.taobao.android.litecreator.base.data.UGCVideo;
import com.taobao.android.litecreator.base.workflow.IWorkflowData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import tb.gww;
import tb.kge;

/* loaded from: classes5.dex */
public class ao {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes5.dex */
    public interface a {
        void a();
    }

    static {
        kge.a(-1614267792);
    }

    public static /* synthetic */ void a(FragmentActivity fragmentActivity, IUGCMedia iUGCMedia) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b510a639", new Object[]{fragmentActivity, iUGCMedia});
        } else {
            b(fragmentActivity, iUGCMedia);
        }
    }

    public static /* synthetic */ void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("687a3683", new Object[]{aVar});
        } else {
            b(aVar);
        }
    }

    public static void a(final FragmentActivity fragmentActivity, Intent intent, int i, Bundle bundle, final a aVar) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce65be44", new Object[]{fragmentActivity, intent, new Integer(i), bundle, aVar});
            return;
        }
        final Serializable serializableExtra = intent.getSerializableExtra(IWorkflowData.KEY);
        if (!(serializableExtra instanceof IUGCMedia) || intent.getData() == null) {
            b(aVar);
            return;
        }
        IUGCMedia iUGCMedia = (IUGCMedia) serializableExtra;
        String b = com.taobao.android.litecreator.base.workflow.e.b(iUGCMedia);
        ArrayList arrayList = new ArrayList();
        arrayList.add(gww.a(b).b("IMAGE_EDIT_PATH"));
        arrayList.add(gww.a(b).b("VIDEO_EDIT_PATH"));
        arrayList.add(gww.a(b).b("PUBLISH_PATH"));
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (ax.b(Uri.parse((String) it.next()), intent.getData())) {
                z = true;
                break;
            }
        }
        if (!z && s.G() && (iUGCMedia.getMeta("go_publish_page_confirm") instanceof Boolean) && ((Boolean) iUGCMedia.getMeta("go_publish_page_confirm")).booleanValue()) {
            u.d("SandBoxCopier", "来自直接发布,Need copy");
            z = true;
        }
        if (!z) {
            u.d("SandBoxCopier", "No Need copy");
            b(aVar);
            return;
        }
        p.a(fragmentActivity, "sandbox_copy_loading");
        au.a(new Runnable() { // from class: com.taobao.android.litecreator.util.ao.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ao.a(FragmentActivity.this, (IUGCMedia) serializableExtra);
                }
            }
        }, new Runnable() { // from class: com.taobao.android.litecreator.util.ao.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                p.b(FragmentActivity.this, "sandbox_copy_loading");
                ao.a(aVar);
            }
        });
    }

    private static void b(FragmentActivity fragmentActivity, IUGCMedia iUGCMedia) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c3ff258", new Object[]{fragmentActivity, iUGCMedia});
            return;
        }
        ArrayList<FileBean> arrayList = new ArrayList();
        for (UGCImage uGCImage : iUGCMedia.getImages()) {
            if (uGCImage.origin != null) {
                arrayList.add(uGCImage.origin);
            }
        }
        for (UGCVideo uGCVideo : iUGCMedia.getVideos()) {
            if (uGCVideo.raw != null) {
                arrayList.add(uGCVideo.raw);
            }
            if (uGCVideo.origin != null) {
                arrayList.add(uGCVideo.origin);
            }
        }
        for (FileBean fileBean : arrayList) {
            if (fileBean instanceof ImageBean) {
                fileBean.copyToSandBox(fragmentActivity, n.b(fragmentActivity, fileBean.getFileSuffix()));
            } else {
                fileBean.copyToSandBox(fragmentActivity, n.a(fragmentActivity, fileBean.getFileSuffix()));
            }
        }
    }

    private static void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddf45cc4", new Object[]{aVar});
        } else if (aVar == null) {
        } else {
            aVar.a();
        }
    }
}
