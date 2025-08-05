package com.taobao.tbliveinteractive.view.system_component;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.d;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.tbliveinteractive.e;
import tb.kge;
import tb.qmz;

/* loaded from: classes8.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f22185a;
    private a b;
    private VideoInfo c;
    private FrameLayout d;
    private e e;
    private String f;
    private DXRootView g;

    static {
        kge.a(-279239579);
    }

    public g(String str, Context context, a aVar, VideoInfo videoInfo, e eVar) {
        this.f = str;
        this.f22185a = context;
        this.b = aVar;
        this.c = videoInfo;
        this.e = eVar;
    }

    public void a(ViewStub viewStub, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb8ca378", new Object[]{this, viewStub, new Boolean(z)});
        } else if (viewStub == null) {
        } else {
            viewStub.setLayoutResource(R.layout.taolive_room_interactive_system_component);
            this.d = (FrameLayout) viewStub.inflate();
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            this.g = qmz.a(this.e, this.f22185a, "taolive_watch_num");
            if (this.g == null) {
                return;
            }
            this.d.addView(this.g);
            int a2 = d.a(this.f22185a, 3.0f);
            this.d.setPadding(a2, 0, a2, 0);
            JSONObject jSONObject = new JSONObject();
            if (this.c != null) {
                String str = a(this.c) ? this.c.taolivePvFormat : this.c.viewCountFormat;
                if (TextUtils.isEmpty(str)) {
                    str = "0";
                }
                jSONObject.put("watchNum", (Object) str);
            }
            qmz.a(this.e, this.g, jSONObject, this.f);
        } catch (Exception unused) {
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                if (this.g == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("watchNum", (Object) str);
                qmz.a(this.e, this.g, jSONObject, this.f);
            } catch (Exception unused) {
            }
        }
    }

    public static boolean a(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ead9f969", new Object[]{videoInfo})).booleanValue() : videoInfo != null && (videoInfo.newRoomType & 256) == 256;
    }
}
