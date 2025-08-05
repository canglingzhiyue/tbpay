package com.taobao.android.detail2.core.framework.view.feeds.visibility;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.feeds.d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.kge;

/* loaded from: classes5.dex */
public class VisibilityData {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f11594a;
    private String b = "none";
    private int c = -1;
    private int d = -1;
    private d e;

    /* loaded from: classes5.dex */
    public interface StartGestureState {
        public static final String GESTURE_DOWN = "down";
        public static final String GESTURE_NONE = "none";
        public static final String GESTURE_UP = "up";

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes5.dex */
        public @interface GestureState {
        }
    }

    static {
        kge.a(102089301);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f11594a = false;
        this.c = -1;
        this.b = "none";
        this.d = -1;
        this.e = null;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f11594a = z;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("799501f7", new Object[]{this, dVar});
        } else {
            this.e = dVar;
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.c;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.d;
    }

    public d e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("246d0f79", new Object[]{this}) : this.e;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "VisibilityData{isDragging=" + this.f11594a + ", startUp='" + this.b + "', currentPosition=" + this.c + ", willDisplayItemPosition=" + this.d + ", lastVisibleViewHolder=" + this.e + '}';
    }
}
