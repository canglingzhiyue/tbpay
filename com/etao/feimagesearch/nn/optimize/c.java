package com.etao.feimagesearch.nn.optimize;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;
import java.util.List;
import tb.kge;

/* loaded from: classes3.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f6922a;
    private List<a> b = new LinkedList();
    private List<b> c = new LinkedList();
    private int d;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f6923a;
        public final RectF b;
        public int c;
        public float d;

        static {
            kge.a(-489970568);
        }

        public a(Bitmap bitmap, RectF rectF, float f) {
            this.f6923a = bitmap;
            this.b = rectF;
            this.d = f;
        }
    }

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f6924a;
        public final int b;
        public final RectF c;

        static {
            kge.a(-103573987);
        }

        public b(int i, int i2, RectF rectF) {
            this.f6924a = i;
            this.b = i2;
            this.c = rectF;
        }
    }

    static {
        kge.a(1446345005);
    }

    public c(int i) {
        this.f6922a = i;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.d;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public void a(int i, int i2, RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66dbd9d9", new Object[]{this, new Integer(i), new Integer(i2), rectF});
        } else {
            this.c.add(new b(i, i2, rectF));
        }
    }

    public void a(Bitmap bitmap, RectF rectF, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c71182c9", new Object[]{this, bitmap, rectF, new Float(f)});
        } else {
            this.b.add(new a(bitmap, rectF, f));
        }
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.f6922a;
    }

    public List<a> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : this.b;
    }

    public List<b> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("195b8bfc", new Object[]{this}) : this.c;
    }

    public void a(List<a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        this.b.clear();
        this.b.addAll(list);
    }
}
