package tb;

import android.content.Context;
import com.alibaba.android.ultron.trade.dinamicX.constructor.TradePriceViewConstructor;
import com.alibaba.android.ultron.trade.dinamicX.constructor.TradeRichTextViewConstructor;
import com.alibaba.android.ultron.trade.dinamicX.constructor.TradeTextInputConstructor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.dinamic.h;
import com.taobao.android.dinamicx.widget.ak;
import java.util.HashMap;
import java.util.Map;
import tb.bmp;
import tb.bmq;
import tb.bzp;

/* loaded from: classes2.dex */
public final class igf extends idl<a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final a f29007a = new a();
    private boolean b = false;

    static {
        kge.a(142655959);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [tb.igf$a, java.lang.Object] */
    @Override // tb.idl
    public /* synthetic */ a a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ff610946", new Object[]{this, new Boolean(z)}) : b(z);
    }

    @Override // tb.idl
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.f29007a.a(TradePriceViewConstructor.VIEW_TAG, new TradePriceViewConstructor());
        this.f29007a.a(TradeRichTextViewConstructor.VIEW_TAG, new TradeRichTextViewConstructor());
        this.f29007a.a(TradeTextInputConstructor.VIEW_TAG, new TradeTextInputConstructor());
        this.f29007a.a(bmp.DX_WIDGET_ID, new bmp.a());
        this.f29007a.a(bmq.DX_WIDGET_ID, new bmq.a());
        this.f29007a.a(bzp.DX_WIDGET_ID, new bzp.a());
        jqg.b("iCart", "CartDXViewPreloader预加载成功");
        this.b = true;
    }

    public a b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("b5b5def6", new Object[]{this, new Boolean(z)});
        }
        if (!this.b) {
            return null;
        }
        jqg.b("iCart", "CartDXViewPreloader#get");
        return this.f29007a;
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, h> f29008a = new HashMap();
        private final Map<Long, ak> b = new HashMap();

        static {
            kge.a(2001467523);
        }

        public void a(String str, h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a51e58c", new Object[]{this, str, hVar});
            } else {
                this.f29008a.put(str, hVar);
            }
        }

        public void a(long j, ak akVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18a2b983", new Object[]{this, new Long(j), akVar});
            } else {
                this.b.put(Long.valueOf(j), akVar);
            }
        }

        public Map<String, h> a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : this.f29008a;
        }

        public Map<Long, ak> b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : this.b;
        }
    }
}
