package tb;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.c;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.taolive.room.adapter.renderlayer.BaseEffectVideoTextLayout;

/* loaded from: classes8.dex */
public class pad implements pmm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1444738046);
        kge.a(1086180552);
    }

    @Override // tb.pmm
    public pml a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pml) ipChange.ipc$dispatch("f0934ef", new Object[]{this}) : new a();
    }

    /* loaded from: classes8.dex */
    public static class a implements pml {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private BaseEffectVideoTextLayout f32522a;

        static {
            kge.a(1128610674);
            kge.a(-427759932);
        }

        private a() {
        }

        public static /* synthetic */ void a(a aVar, Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2b32880", new Object[]{aVar, context});
            } else {
                aVar.b(context);
            }
        }

        @Override // tb.pml
        public View a(final Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
            }
            if (c.a().d()) {
                b(context);
            } else {
                c.a().a(new c.b() { // from class: tb.pad.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.live.plugin.proxy.c.b
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            a.a(a.this, context);
                        }
                    }
                });
            }
            return this.f32522a;
        }

        private void b(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            } else if (f.n() == null) {
            } else {
                this.f32522a = f.n().createEffectVideoTextLayout(context);
            }
        }

        @Override // tb.pml
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                return;
            }
            BaseEffectVideoTextLayout baseEffectVideoTextLayout = this.f32522a;
            if (baseEffectVideoTextLayout == null) {
                return;
            }
            baseEffectVideoTextLayout.setData(jSONObject);
        }

        @Override // tb.pml
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            BaseEffectVideoTextLayout baseEffectVideoTextLayout = this.f32522a;
            if (baseEffectVideoTextLayout == null) {
                return;
            }
            baseEffectVideoTextLayout.show();
        }

        @Override // tb.pml
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            BaseEffectVideoTextLayout baseEffectVideoTextLayout = this.f32522a;
            if (baseEffectVideoTextLayout == null) {
                return;
            }
            baseEffectVideoTextLayout.destroy();
            this.f32522a = null;
        }

        @Override // tb.pml
        public View c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("adc2ed2c", new Object[]{this}) : this.f32522a;
        }

        @Override // tb.pml
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                return;
            }
            BaseEffectVideoTextLayout baseEffectVideoTextLayout = this.f32522a;
            if (baseEffectVideoTextLayout == null || baseEffectVideoTextLayout.getLayoutParams() == null) {
                return;
            }
            this.f32522a.getLayoutParams().width = i;
            this.f32522a.invalidate();
        }

        @Override // tb.pml
        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
                return;
            }
            BaseEffectVideoTextLayout baseEffectVideoTextLayout = this.f32522a;
            if (baseEffectVideoTextLayout == null || baseEffectVideoTextLayout.getLayoutParams() == null) {
                return;
            }
            this.f32522a.getLayoutParams().height = i;
            this.f32522a.invalidate();
        }
    }
}
