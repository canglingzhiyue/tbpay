package com.taobao.android.weex_uikit.widget.video;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.video.f;
import tb.kge;

/* loaded from: classes6.dex */
public class b implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final UINode f16238a;
    private final f.a b;
    private boolean c = false;
    private JSONObject d = null;

    static {
        kge.a(566145542);
        kge.a(-784278301);
    }

    public b(UINode uINode, f.a aVar) {
        this.f16238a = uINode;
        this.b = aVar;
    }

    private static JSONObject b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("413d529", new Object[]{new Integer(i), new Integer(i2)});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(f.c, (Object) Float.valueOf(i2 / 1000.0f));
        jSONObject2.put(f.b, (Object) Float.valueOf(i / 1000.0f));
        jSONObject.put(f.f16240a, (Object) jSONObject2);
        return jSONObject;
    }

    private static void a(UINode uINode, String str, JSONObject jSONObject) {
        MUSDKInstance uINode2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c57f2546", new Object[]{uINode, str, jSONObject});
        } else if (!uINode.hasEvent(str) || (uINode2 = uINode.getInstance()) == null || uINode2.isDestroyed() || TextUtils.isEmpty(str)) {
        } else {
            uINode2.fireEventOnNode(uINode.getNodeId(), str, jSONObject);
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.video.d
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (this.c) {
            this.d = b(i2, i);
        } else {
            a(this.f16238a, "timeupdate", b(i2, i));
        }
        if (this.f16238a.getInstance() == null || this.f16238a.getInstance().isDestroyed() || this.f16238a.getMountContent() == null) {
            return;
        }
        ((MUSVideoView) this.f16238a.getMountContent()).hidePoster();
    }

    @Override // com.taobao.android.weex_uikit.widget.video.d
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        MUSVideoView mUSVideoView = (MUSVideoView) this.f16238a.getMountContent();
        if (mUSVideoView != null) {
            mUSVideoView.onPlayed();
        }
        if (this.b.f16244a) {
            a(this.f16238a, "play", null);
            this.b.f16244a = false;
        }
        this.f16238a.fireNativeEvent("videocallback", "start");
    }

    @Override // com.taobao.android.weex_uikit.widget.video.d
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.b.f16244a) {
        } else {
            a(this.f16238a, "pause", null);
            this.b.f16244a = true;
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.video.d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (f.e(this.f16238a)) {
        } else {
            f.i(this.f16238a);
            this.b.f16244a = true;
            a(this.f16238a, "ended", null);
            this.f16238a.fireNativeEvent("videocallback", "finish");
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.video.d
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            a(this.f16238a, "error", null);
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.video.d
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            a(this.f16238a, "fovchange", jSONObject);
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.video.d
    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else {
            a(this.f16238a, "anchorlistupdate", jSONObject);
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.video.d
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.c = true;
        this.d = null;
    }

    @Override // com.taobao.android.weex_uikit.widget.video.d
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.c = false;
        JSONObject jSONObject = this.d;
        if (jSONObject == null) {
            return;
        }
        a(this.f16238a, "timeupdate", jSONObject);
        this.d = null;
    }
}
