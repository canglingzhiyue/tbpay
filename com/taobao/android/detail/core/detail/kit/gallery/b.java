package com.taobao.android.detail.core.detail.kit.gallery;

import android.content.Context;
import android.view.View;
import android.widget.ProgressBar;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.widget.base.photo.PhotoView;
import com.taobao.android.detail.core.detail.kit.view.widget.base.photo.b;
import com.taobao.android.detail.core.utils.i;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.emu;
import tb.epj;
import tb.epl;
import tb.kge;

/* loaded from: classes4.dex */
public class b extends com.taobao.android.detail.core.detail.kit.gallery.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int d;
    private final ArrayList<a> e;

    static {
        kge.a(1305129880);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public b(Context context, int i) {
        super(context);
        this.e = new ArrayList<>();
        this.d = i;
        emu.a("com.taobao.android.detail.core.detail.kit.gallery.GalleryPageViewAdapter");
    }

    private void a(int i, C0375b c0375b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45f448b5", new Object[]{this, new Integer(i), c0375b});
            return;
        }
        int size = i % this.f9534a.size();
        epl a2 = new epl.a().a();
        a aVar = new a(c0375b);
        this.e.add(aVar);
        epj.b().a(this.f9534a.get(size), c0375b.f9540a, a2, aVar);
        c0375b.f9540a.setmCanScale(true);
        c0375b.f9540a.setOnViewTapListener(new b.e() { // from class: com.taobao.android.detail.core.detail.kit.gallery.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.core.detail.kit.view.widget.base.photo.b.e
            public void a(View view, float f, float f2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c23a8ea", new Object[]{this, view, new Float(f), new Float(f2)});
                } else if (b.this.c == null) {
                } else {
                    b.this.c.a(view);
                }
            }
        });
        c0375b.f9540a.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.taobao.android.detail.core.detail.kit.gallery.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                }
                return true;
            }
        });
    }

    @Override // com.taobao.android.detail.core.detail.kit.gallery.a
    public View b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("42ac29fc", new Object[]{this, new Integer(i)});
        }
        View inflate = View.inflate(this.b, this.d, null);
        C0375b c0375b = new C0375b();
        c0375b.f9540a = (PhotoView) inflate.findViewById(R.id.common_image);
        c0375b.b = (ProgressBar) inflate.findViewById(R.id.loading_view);
        inflate.setTag(c0375b);
        a(i, c0375b);
        a(i, inflate);
        return inflate;
    }

    /* loaded from: classes4.dex */
    public static class a implements com.taobao.android.detail.datasdk.protocol.image.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private C0375b f9539a;

        static {
            kge.a(-1101505789);
            kge.a(128859412);
        }

        public a(C0375b c0375b) {
            this.f9539a = null;
            this.f9539a = c0375b;
        }

        @Override // com.taobao.android.detail.datasdk.protocol.image.b
        public void onSuccess(com.taobao.android.detail.datasdk.protocol.image.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a8e27a", new Object[]{this, aVar});
                return;
            }
            i.c("GalleryPageViewAdapter", "onSuccess url = " + aVar.f10068a);
            C0375b c0375b = this.f9539a;
            if (c0375b == null) {
                i.c("GalleryPageViewAdapter", "the viewHolder is empty");
                return;
            }
            try {
                c0375b.b.setVisibility(8);
                if (!(this.f9539a.f9540a instanceof PhotoView)) {
                    return;
                }
                this.f9539a.f9540a.update();
            } catch (Throwable unused) {
            }
        }

        @Override // com.taobao.android.detail.datasdk.protocol.image.b
        public void onFailure(com.taobao.android.detail.datasdk.protocol.image.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15b99301", new Object[]{this, aVar});
                return;
            }
            i.c("GalleryPageViewAdapter", "onFailure url = " + aVar.f10068a);
            C0375b c0375b = this.f9539a;
            if (c0375b == null) {
                return;
            }
            try {
                c0375b.b.setVisibility(8);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.taobao.android.detail.core.detail.kit.gallery.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0375b {

        /* renamed from: a  reason: collision with root package name */
        public PhotoView f9540a;
        public ProgressBar b;

        static {
            kge.a(-1124056739);
        }

        private C0375b() {
        }
    }
}
