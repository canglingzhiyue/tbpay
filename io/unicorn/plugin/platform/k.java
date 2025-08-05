package io.unicorn.plugin.platform;

import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.Map;
import tb.jvq;
import tb.kge;

/* loaded from: classes9.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private WeexPlatformView f24874a;
    private WeexNestedFrameLayout b;
    private d c;
    private final String d = com.taobao.tao.flexbox.layoutmanager.view.b.PULL_HORIZONTAL_DRAG;

    static {
        kge.a(1526349544);
    }

    public k(WeexPlatformView weexPlatformView, d dVar) {
        this.f24874a = weexPlatformView;
        this.c = dVar;
        if (this.f24874a.getMUSInstance() != null) {
            this.f24874a.getMUSInstance().setGestureEventListener(new jvq() { // from class: io.unicorn.plugin.platform.k.1
                @Override // tb.jvq
                public void a(Map<String, Object> map) {
                    if (map != null) {
                        boolean booleanValue = ((Boolean) map.get("state")).booleanValue();
                        String str = (String) map.get("acceptGestureType");
                        if (!booleanValue || !com.taobao.tao.flexbox.layoutmanager.view.b.PULL_HORIZONTAL_DRAG.equals(str) || k.this.b == null) {
                            return;
                        }
                        k.this.b.setInterceptRoll(true);
                    }
                }
            });
        }
    }

    public View a(View view) {
        if (this.b == null) {
            this.b = new WeexNestedFrameLayout(this.f24874a.getContext());
            this.b.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            if (view != null) {
                this.b.addView(view);
            }
        }
        return this.b;
    }

    public void a(boolean z) {
        if (this.b.isMoveSlideUp()) {
            this.b.setPlatformListCanScroll(false);
            this.c.a(false);
            HashMap hashMap = new HashMap();
            hashMap.put("enable", true);
            this.f24874a.fireEvent("scrollable.scroll", hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(boolean z, double d) {
        this.b.setPlatformListCanScroll(z);
        this.c.a(z);
        this.c.a(d);
    }

    public void a(boolean z, int i) {
        this.b.setPlatformListCanScroll(false);
        this.c.a(false);
        HashMap hashMap = new HashMap();
        if (this.b.isActionMove()) {
            i = 0;
        }
        hashMap.put("enable", true);
        hashMap.put("velocity", Integer.valueOf(i));
        this.f24874a.fireEvent("scrollable.scroll", hashMap);
    }
}
