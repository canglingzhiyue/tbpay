package com.taobao.tao.flexbox.layoutmanager.component;

import android.graphics.Color;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView;
import tb.kge;
import tb.oec;

/* loaded from: classes8.dex */
public interface r {
    public static final int placeHolder = Color.argb(255, 232, 232, 232);

    /* loaded from: classes8.dex */
    public static class a implements SpanWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private View f20190a;
        private com.taobao.tao.flexbox.layoutmanager.drawable.d b;

        static {
            kge.a(-1778974469);
            kge.a(-1939613520);
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3db47e1", new Object[]{this, spannable, obj, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3491016d", new Object[]{this, spannable, obj, new Integer(i), new Integer(i2)});
            }
        }

        public static /* synthetic */ void a(a aVar, Spannable spannable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2d61776", new Object[]{aVar, spannable});
            } else {
                aVar.a(spannable);
            }
        }

        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            } else {
                this.f20190a = view;
            }
        }

        public void a(com.taobao.tao.flexbox.layoutmanager.drawable.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7675f79d", new Object[]{this, dVar});
            } else {
                this.b = dVar;
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(final Spannable spannable, Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd069bcd", new Object[]{this, spannable, obj, new Integer(i), new Integer(i2)});
            } else if (!(obj instanceof ImageSpan)) {
            } else {
                spannable.removeSpan(this);
                if (this.f20190a == null && this.b == null) {
                    return;
                }
                if (oec.f()) {
                    a(spannable);
                } else {
                    oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.r.a.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                a.a(a.this, spannable);
                            }
                        }
                    });
                }
            }
        }

        private void a(Spannable spannable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a51c0dbb", new Object[]{this, spannable});
                return;
            }
            View view = this.f20190a;
            if (view != null) {
                if (view instanceof TextView) {
                    ((TextView) view).setText(spannable);
                    return;
                } else if (!(view instanceof StaticLayoutView)) {
                    return;
                } else {
                    view.invalidate();
                    return;
                }
            }
            com.taobao.tao.flexbox.layoutmanager.drawable.d dVar = this.b;
            if (dVar == null) {
                return;
            }
            dVar.a(spannable);
        }
    }
}
