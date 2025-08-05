package tb;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import tb.arc;

/* loaded from: classes4.dex */
public class idr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f28940a;

    /* loaded from: classes4.dex */
    public interface b {
        void a(View view, boolean z, int i);
    }

    static {
        kge.a(288187367);
    }

    public idr(Context context) {
        this.f28940a = context;
    }

    public void a(ArrayList<Integer> arrayList, boolean z, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0909ced", new Object[]{this, arrayList, new Boolean(z), bVar});
            return;
        }
        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            bVar.a(a(this.f28940a, next.intValue()), z, next.intValue());
        }
    }

    private View a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9a97f025", new Object[]{this, context, new Integer(i)});
        }
        try {
            return new a(new kxa(context)).inflate(i, (ViewGroup) null, false);
        } catch (Throwable unused) {
            arc.a().a("Layout异步加载失败", arc.a.a().a("AURA/performance").b());
            return null;
        }
    }

    /* loaded from: classes4.dex */
    public static class a extends LayoutInflater {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final String[] f28941a;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -424637217) {
                return super.onCreateView((String) objArr[0], (AttributeSet) objArr[1]);
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        static {
            kge.a(-1838372996);
            f28941a = new String[]{"android.widget.", "android.webkit.", "android.app."};
        }

        public a(Context context) {
            super(context);
        }

        @Override // android.view.LayoutInflater
        public LayoutInflater cloneInContext(Context context) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (LayoutInflater) ipChange.ipc$dispatch("9e726fa6", new Object[]{this, context}) : new a(context);
        }

        @Override // android.view.LayoutInflater
        public View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
            View createView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("e6b08cdf", new Object[]{this, str, attributeSet});
            }
            for (String str2 : f28941a) {
                try {
                    createView = createView(str, str2, attributeSet);
                } catch (ClassNotFoundException unused) {
                }
                if (createView != null) {
                    return createView;
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }
}
