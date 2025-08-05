package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.ag;
import com.uploader.implement.d;
import java.lang.ref.WeakReference;
import tb.rog;

/* loaded from: classes9.dex */
public class roh extends roe {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final rog e;

    public roh(d dVar, rok rokVar) {
        super(dVar, rokVar);
        this.e = new rog(dVar, rokVar);
        this.e.a(new a(this));
    }

    @Override // tb.rop
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (com.uploader.implement.a.a(2)) {
            com.uploader.implement.a.a(2, "LongLivedConnection", this.c + " connectAsync");
        }
        this.e.a();
        return true;
    }

    @Override // tb.rop
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        if (com.uploader.implement.a.a(2)) {
            com.uploader.implement.a.a(2, "LongLivedConnection", this.c + " closeAsync");
        }
        this.e.b();
        return true;
    }

    @Override // tb.rop
    public void a(roq roqVar, int i) {
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0510eff", new Object[]{this, roqVar, new Integer(i)});
            return;
        }
        int i2 = roqVar.d;
        if (roqVar.c != 0) {
            bArr = new byte[i2];
            System.arraycopy(roqVar.b, roqVar.c, bArr, 0, i2);
        } else {
            bArr = roqVar.b;
        }
        rom b = b();
        if (b != null) {
            b.a(this, i);
        }
        this.e.a(i, bArr, i2);
    }

    @Override // tb.rop
    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.e.c();
    }

    /* loaded from: classes9.dex */
    public static class a implements rog.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<roh> f33266a;

        public a(roh rohVar) {
            this.f33266a = new WeakReference<>(rohVar);
        }

        @Override // tb.rog.a
        public void a(int i) {
            rom b;
            rov rovVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                return;
            }
            roh rohVar = this.f33266a.get();
            if (rohVar == null || (b = rohVar.b()) == null) {
                return;
            }
            if (i == -2032) {
                String num = Integer.toString(i);
                rovVar = new rov("300", num, ag.ARG_TAOKE_ERROR + i, true);
            } else {
                String num2 = (i == -2601 || i == -2613 || i == -2413) ? "-1" : Integer.toString(i);
                rovVar = new rov("100", num2, ag.ARG_TAOKE_ERROR + i, true);
            }
            b.a(rohVar, rovVar);
        }

        @Override // tb.rog.a
        public void a() {
            rom b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            roh rohVar = this.f33266a.get();
            if (rohVar == null || (b = rohVar.b()) == null) {
                return;
            }
            b.a(rohVar);
        }

        @Override // tb.rog.a
        public void b(int i) {
            rom b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
                return;
            }
            roh rohVar = this.f33266a.get();
            if (rohVar == null || (b = rohVar.b()) == null) {
                return;
            }
            b.b(rohVar, i);
        }

        @Override // tb.rog.a
        public void a(int i, int i2) {
            rom b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            roh rohVar = this.f33266a.get();
            if (rohVar == null || (b = rohVar.b()) == null) {
                return;
            }
            String num = Integer.toString(i2);
            b.a(rohVar, new rov("100", num, "onSendFailed" + i2, false));
        }

        @Override // tb.rog.a
        public void a(byte[] bArr, int i) {
            rom b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2713f1b4", new Object[]{this, bArr, new Integer(i)});
                return;
            }
            roh rohVar = this.f33266a.get();
            if (rohVar == null || (b = rohVar.b()) == null) {
                return;
            }
            roq roqVar = new roq();
            roqVar.b = bArr;
            roqVar.c = 0;
            roqVar.d = i;
            b.a(rohVar, roqVar);
        }
    }
}
