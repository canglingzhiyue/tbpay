package com.loc;

import android.content.Context;
import android.location.Location;
import android.os.Handler;
import mtopsdk.common.util.StringUtils;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import tb.orq;

/* loaded from: classes4.dex */
public final class fd {
    private File b;
    private Handler d;
    private String e;
    private boolean f;

    /* renamed from: a  reason: collision with root package name */
    private LinkedList<fc> f7787a = new LinkedList<>();
    private boolean c = false;
    private Runnable g = new Runnable() { // from class: com.loc.fd.1
        @Override // java.lang.Runnable
        public final void run() {
            if (!fd.this.c) {
                if (fd.this.f) {
                    fd.this.b();
                    fd.this.f = false;
                }
                if (fd.this.d == null) {
                    return;
                }
                fd.this.d.postDelayed(fd.this.g, 60000L);
            }
        }
    };

    public fd(Context context, Handler handler) {
        this.e = null;
        this.d = handler;
        String path = context.getFilesDir().getPath();
        if (this.e == null) {
            this.e = fy.l(context);
        }
        try {
            this.b = new File(path, "hisloc");
        } catch (Throwable th) {
            ej.a(th);
        }
        a();
        Handler handler2 = this.d;
        if (handler2 != null) {
            handler2.removeCallbacks(this.g);
            this.d.postDelayed(this.g, 60000L);
        }
    }

    private void a() {
        LinkedList<fc> linkedList = this.f7787a;
        if (linkedList == null || linkedList.size() <= 0) {
            for (String str : fy.a(this.b)) {
                try {
                    String str2 = new String(fg.b(p.b(str), this.e), "UTF-8");
                    fc fcVar = new fc();
                    fcVar.a(new JSONObject(str2));
                    this.f7787a.add(fcVar);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        StringBuilder sb = new StringBuilder();
        Iterator<fc> it = this.f7787a.iterator();
        while (it.hasNext()) {
            try {
                String a2 = it.next().a();
                sb.append(p.b(fg.a(a2.getBytes("UTF-8"), this.e)) + "\n");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        String sb2 = sb.toString();
        if (!StringUtils.isEmpty(sb2)) {
            fy.a(this.b, sb2);
        }
    }

    private static boolean b(ArrayList<fa> arrayList, ArrayList<eg> arrayList2) {
        return arrayList == null || arrayList.size() <= 0 || arrayList2 == null || arrayList2.size() <= 0 || (((long) arrayList.size()) < 4 && ((long) arrayList2.size()) < 20);
    }

    public final List<fc> a(ArrayList<fa> arrayList, ArrayList<eg> arrayList2) {
        if (b(arrayList, arrayList2)) {
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList3 = new ArrayList();
            int i = 0;
            Iterator<fc> it = this.f7787a.iterator();
            while (it.hasNext()) {
                fc next = it.next();
                if (currentTimeMillis - next.d < 21600000000L) {
                    arrayList3.add(next);
                    i++;
                }
                if (i == 10) {
                    break;
                }
            }
            return arrayList3;
        }
        return null;
    }

    public final void a(fc fcVar) {
        Iterator<fc> it = this.f7787a.iterator();
        fc fcVar2 = null;
        fc fcVar3 = null;
        int i = 0;
        while (it.hasNext()) {
            fc next = it.next();
            if (next.f7786a == 1) {
                if (fcVar3 == null) {
                    fcVar3 = next;
                }
                i++;
                fcVar2 = next;
            }
        }
        if (fcVar2 != null) {
            new Location("gps");
            if (fcVar.d - fcVar2.d < orq.FRAME_CHECK_TIMEOUT && fy.a(new double[]{fcVar.b, fcVar.c, fcVar2.b, fcVar2.c}) < 20.0f) {
                return;
            }
        }
        if (i >= 5) {
            this.f7787a.remove(fcVar3);
        }
        if (this.f7787a.size() >= 10) {
            this.f7787a.removeFirst();
        }
        this.f7787a.add(fcVar);
        this.f = true;
    }

    public final void a(boolean z) {
        if (!z) {
            this.g.run();
        }
        Handler handler = this.d;
        if (handler != null) {
            handler.removeCallbacks(this.g);
        }
        this.c = true;
    }

    public final void b(fc fcVar) {
        if (this.f7787a.size() > 0) {
            if (fcVar.f7786a != 6 && fcVar.f7786a != 5) {
                if (this.f7787a.contains(fcVar)) {
                    return;
                }
                if (this.f7787a.size() >= 10) {
                    this.f7787a.removeFirst();
                }
                this.f7787a.add(fcVar);
                this.f = true;
                return;
            }
            fc last = this.f7787a.getLast();
            if (last.c == fcVar.c && last.b == fcVar.b && last.e == fcVar.e) {
                return;
            }
            if (this.f7787a.size() >= 10) {
                this.f7787a.removeFirst();
            }
            this.f7787a.add(fcVar);
            this.f = true;
        }
    }
}
