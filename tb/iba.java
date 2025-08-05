package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public class iba implements ibh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Logger q = Logger.getLogger(iba.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public String f28885a = null;
    public ArrayList<ibe> b = new ArrayList<>();
    public ArrayList<ibg> c = new ArrayList<>();
    public ArrayList<ibf> d = new ArrayList<>();
    public HashMap<String, ibc> e = new HashMap<>();
    public ArrayList<ibc> f = new ArrayList<>();
    public ArrayList<ibb> g = new ArrayList<>();
    public HashMap<Integer, ArrayList<ibb>> h = new HashMap<>();
    private int r = 0;
    private ArrayList<ibb> s = null;
    public HashMap<String, ArrayList<ibb>> i = new HashMap<>();
    private ArrayList<String> t = new ArrayList<>();
    private ArrayList<ArrayList<ibb>> u = new ArrayList<>();
    public String j = null;
    private ibd v = null;
    private ibd w = null;
    public HashMap<String, ibd> k = new HashMap<>();
    private ibd x = null;
    public HashMap<String, ibd> l = new HashMap<>();
    private ibd y = null;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;

    static {
        kge.a(-1925538373);
        kge.a(1614329231);
    }

    @Override // tb.ibh
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f28885a = str;
        }
    }

    @Override // tb.ibh
    public void a(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25edca58", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
        } else {
            this.b.add(new ibe(f, f2, f3));
        }
    }

    @Override // tb.ibh
    public void a(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0fea68", new Object[]{this, new Float(f), new Float(f2)});
        } else {
            this.c.add(new ibg(f, f2));
        }
    }

    @Override // tb.ibh
    public void b(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dcef737", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
        } else {
            this.d.add(new ibf(f, f2, f3));
        }
    }

    @Override // tb.ibh
    public void a(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c198176", new Object[]{this, iArr});
            return;
        }
        Logger logger = this.q;
        Level level = Level.INFO;
        logger.log(level, " Got " + iArr.length + " points in builder, ignoring");
    }

    @Override // tb.ibh
    public void b(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90ffbcb7", new Object[]{this, iArr});
            return;
        }
        Logger logger = this.q;
        Level level = Level.INFO;
        logger.log(level, " Got a line of " + iArr.length + " segments in builder, ignoring");
    }

    @Override // tb.ibh
    public void c(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5e5f7f8", new Object[]{this, iArr});
            return;
        }
        ibb ibbVar = new ibb();
        ibbVar.b = this.v;
        ibbVar.c = this.w;
        int i = 0;
        while (i < iArr.length) {
            ibc ibcVar = new ibc();
            int i2 = i + 1;
            int i3 = iArr[i];
            if (i3 < 0) {
                i3 += this.b.size();
            }
            int i4 = i3 - 1;
            if (i4 >= 0 && i4 < this.b.size()) {
                ibcVar.b = this.b.get(i4);
            } else {
                this.q.log(Level.SEVERE, "Index for geometric vertex=" + i3 + " is out of the current range of geometric vertex values 1 to " + this.b.size() + ", ignoring");
            }
            int i5 = i2 + 1;
            int i6 = iArr[i2];
            if (i6 != Integer.MIN_VALUE) {
                if (i6 < 0) {
                    i6 += this.c.size();
                }
                int i7 = i6 - 1;
                if (i7 >= 0 && i7 < this.c.size()) {
                    ibcVar.c = this.c.get(i7);
                } else {
                    this.q.log(Level.SEVERE, "Index for texture vertex=" + i6 + " is out of the current range of texture vertex values 1 to " + this.c.size() + ", ignoring");
                }
            }
            int i8 = i5 + 1;
            int i9 = iArr[i5];
            if (i9 != Integer.MIN_VALUE) {
                if (i9 < 0) {
                    i9 += this.d.size();
                }
                int i10 = i9 - 1;
                if (i10 >= 0 && i10 < this.d.size()) {
                    ibcVar.d = this.d.get(i10);
                } else {
                    this.q.log(Level.SEVERE, "Index for vertex normal=" + i9 + " is out of the current range of vertex normal values 1 to " + this.d.size() + ", ignoring");
                }
            }
            if (ibcVar.b == null) {
                this.q.log(Level.SEVERE, "Can't add vertex to face with missing vertex!  Throwing away face.");
                this.p++;
                return;
            }
            String ibcVar2 = ibcVar.toString();
            ibc ibcVar3 = this.e.get(ibcVar2);
            if (ibcVar3 == null) {
                this.e.put(ibcVar2, ibcVar);
                ibcVar.f28887a = this.f.size();
                this.f.add(ibcVar);
            } else {
                ibcVar = ibcVar3;
            }
            ibbVar.a(ibcVar);
            i = i8;
        }
        ArrayList<ibb> arrayList = this.s;
        if (arrayList != null) {
            arrayList.add(ibbVar);
        }
        if (this.u.size() > 0) {
            for (int i11 = 0; i11 < this.u.size(); i11++) {
                this.u.get(i11).add(ibbVar);
            }
        }
        this.g.add(ibbVar);
        if (ibbVar.f28886a.size() == 3) {
            this.m++;
        } else if (ibbVar.f28886a.size() == 4) {
            this.n++;
        } else {
            this.o++;
        }
    }

    @Override // tb.ibh
    public void a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b26fb7", new Object[]{this, strArr});
            return;
        }
        this.t.clear();
        this.u.clear();
        if (strArr == null) {
            return;
        }
        for (String str : strArr) {
            String trim = str.trim();
            this.t.add(trim);
            if (this.i.get(trim) == null) {
                this.i.put(trim, new ArrayList<>());
            }
            this.u.add(this.i.get(trim));
        }
    }

    @Override // tb.ibh
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    @Override // tb.ibh
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.r = i;
        int i2 = this.r;
        if (i2 == 0 || this.h.get(Integer.valueOf(i2)) != null) {
            return;
        }
        this.s = new ArrayList<>();
        this.h.put(Integer.valueOf(this.r), this.s);
    }

    @Override // tb.ibh
    public void b(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffb3fe96", new Object[]{this, strArr});
        } else if (strArr == null) {
            this.q.log(Level.INFO, " ERROR! Got a maplib line with null names array - blank group line? (i.e. \"g\\n\" ?)");
        } else if (strArr.length == 1) {
            Logger logger = this.q;
            Level level = Level.INFO;
            logger.log(level, " Got a maplib line with one name=|" + strArr[0] + "|");
        } else {
            this.q.log(Level.INFO, " Got a maplib line;");
            for (int i = 0; i < strArr.length; i++) {
                Logger logger2 = this.q;
                Level level2 = Level.INFO;
                logger2.log(level2, "        names[" + i + "] = |" + strArr[i] + "|");
            }
        }
    }

    @Override // tb.ibh
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.w = this.l.get(str);
        }
    }

    @Override // tb.ibh
    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.v = this.k.get(str);
        }
    }

    @Override // tb.ibh
    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        String str2 = "Loaded filename '" + str + "' with " + this.b.size() + " verticesG, " + this.c.size() + " verticesT, " + this.d.size() + " verticesN and " + this.g.size() + " faces, of which " + this.m + " triangles, " + this.n + " quads, and " + this.o + " with more than 4 points, and faces with errors " + this.p;
    }
}
