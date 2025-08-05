package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.n;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class gae extends gaf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-827490447);
    }

    public static /* synthetic */ Object ipc$super(gae gaeVar, String str, Object... objArr) {
        if (str.hashCode() == 378564147) {
            return super.a((DXRecyclerLayout) objArr[0], (List) objArr[1], (List) objArr[2], ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), (n) objArr[5]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.gaf
    public boolean a(DXRecyclerLayout dXRecyclerLayout, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be1f92f0", new Object[]{this, dXRecyclerLayout, jSONObject})).booleanValue();
        }
        return false;
    }

    @Override // tb.gaf
    public boolean a(DXRecyclerLayout dXRecyclerLayout, JSONObject jSONObject, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a28f7103", new Object[]{this, dXRecyclerLayout, jSONObject, nVar})).booleanValue();
        }
        return false;
    }

    @Override // tb.gaf
    public boolean a(DXRecyclerLayout dXRecyclerLayout, JSONObject jSONObject, boolean z, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd16f87f", new Object[]{this, dXRecyclerLayout, jSONObject, new Boolean(z), nVar})).booleanValue();
        }
        return false;
    }

    @Override // tb.gaf
    public boolean b(DXRecyclerLayout dXRecyclerLayout, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("844a1bb1", new Object[]{this, dXRecyclerLayout, jSONObject})).booleanValue();
        }
        return false;
    }

    @Override // tb.gaf
    public boolean b(DXRecyclerLayout dXRecyclerLayout, JSONObject jSONObject, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef3d9a84", new Object[]{this, dXRecyclerLayout, jSONObject, nVar})).booleanValue();
        }
        return false;
    }

    @Override // tb.gaf
    public boolean c(DXRecyclerLayout dXRecyclerLayout, JSONObject jSONObject, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3bebc405", new Object[]{this, dXRecyclerLayout, jSONObject, nVar})).booleanValue();
        }
        return false;
    }

    public void a(DXRecyclerLayout dXRecyclerLayout, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8391ac", new Object[]{this, dXRecyclerLayout, jSONArray});
        } else if (jSONArray == null && jSONArray.size() <= 0) {
        } else {
            Object obj = jSONArray.get(0);
            fzy b = b(dXRecyclerLayout);
            if (obj == null || b == null || b.f()) {
                return;
            }
            int g = b.g();
            if (jSONArray.size() > 1) {
                try {
                    Integer integer = jSONArray.getInteger(1);
                    if (integer != null) {
                        if (integer.intValue() > b.g()) {
                            integer = Integer.valueOf(b.g());
                        } else if (integer.intValue() < 0) {
                            integer = 0;
                        }
                        g = integer.intValue();
                    }
                } catch (Exception unused) {
                }
            }
            if (jSONArray.size() > 2) {
                try {
                    jSONArray.getBooleanValue(2);
                } catch (Exception unused2) {
                }
            }
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                if (g < 0 || g > b.g()) {
                    return;
                }
                if (a(dXRecyclerLayout) != null && g >= 0 && g <= a(dXRecyclerLayout).size()) {
                    a(dXRecyclerLayout).add(g, jSONObject);
                }
                b.a(g, a(dXRecyclerLayout, jSONObject, d(dXRecyclerLayout), g, (n) null));
                c(dXRecyclerLayout);
            } else if (!(obj instanceof JSONArray) || g < 0 || g > b.g()) {
            } else {
                if (a(dXRecyclerLayout) != null && g >= 0 && g <= a(dXRecyclerLayout).size()) {
                    a(dXRecyclerLayout).addAll(g, (JSONArray) obj);
                }
                ArrayList<DXWidgetNode> a2 = a(dXRecyclerLayout, a(dXRecyclerLayout), d(dXRecyclerLayout), g, g + ((JSONArray) obj).size(), (n) null);
                if (a2 == null || a2.isEmpty()) {
                    return;
                }
                b.a(g, a2);
                c(dXRecyclerLayout);
            }
        }
    }

    public void b(DXRecyclerLayout dXRecyclerLayout, JSONArray jSONArray) {
        Object obj;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46746ccb", new Object[]{this, dXRecyclerLayout, jSONArray});
        } else if (jSONArray != null && jSONArray.size() > 1 && (obj = jSONArray.get(0)) != null) {
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                int i2 = -1;
                try {
                    Integer integer = jSONArray.getInteger(1);
                    if (integer != null) {
                        i2 = integer.intValue();
                    }
                    i = i2;
                } catch (Exception unused) {
                    i = -1;
                }
                a(dXRecyclerLayout, jSONObject, gah.a(null), i, (n) null);
            } else if (obj instanceof JSONArray) {
                Object obj2 = jSONArray.get(2);
                if (obj2 instanceof JSONArray) {
                    for (int i3 = 0; i3 < ((JSONArray) obj2).size(); i3++) {
                        try {
                            a(dXRecyclerLayout, ((JSONArray) obj).getJSONObject(i3), gah.a(null), ((JSONArray) obj2).getInteger(i3).intValue(), (n) null);
                        } catch (Exception unused2) {
                        }
                    }
                }
            }
            c(dXRecyclerLayout);
        }
    }

    public void c(DXRecyclerLayout dXRecyclerLayout, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e6547ea", new Object[]{this, dXRecyclerLayout, jSONArray});
        } else if (jSONArray == null || jSONArray.size() <= 0) {
        } else {
            Object obj = jSONArray.get(0);
            if (!(obj instanceof JSONArray)) {
                return;
            }
            if (a(dXRecyclerLayout) != null) {
                i = a(dXRecyclerLayout).size();
                a(dXRecyclerLayout).addAll((JSONArray) obj);
            }
            ArrayList<DXWidgetNode> a2 = a(dXRecyclerLayout, a(dXRecyclerLayout), d(dXRecyclerLayout), i, a(dXRecyclerLayout).size(), (n) null);
            fzy b = b(dXRecyclerLayout);
            if (a2 == null || a2.isEmpty() || b == null || b.f()) {
                return;
            }
            b.a(i, a2);
            c(dXRecyclerLayout);
        }
    }

    public void d(DXRecyclerLayout dXRecyclerLayout, JSONArray jSONArray) {
        Object obj;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6562309", new Object[]{this, dXRecyclerLayout, jSONArray});
        } else if (jSONArray == null || jSONArray.size() <= 0 || (obj = jSONArray.get(0)) == null) {
        } else {
            if (obj instanceof JSONArray) {
                Iterator<Object> it = ((JSONArray) obj).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next != null && (next instanceof Integer) && a(dXRecyclerLayout, ((Integer) next).intValue())) {
                        z = true;
                    }
                }
            } else if ((obj instanceof Integer) && a(dXRecyclerLayout, ((Integer) obj).intValue())) {
                z = true;
            }
            if (!z) {
                return;
            }
            c(dXRecyclerLayout);
        }
    }

    private boolean a(DXRecyclerLayout dXRecyclerLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59f0bb03", new Object[]{this, dXRecyclerLayout, new Integer(i)})).booleanValue();
        }
        if (a(dXRecyclerLayout) != null && i >= 0 && i < a(dXRecyclerLayout).size()) {
            a(dXRecyclerLayout).remove(i);
        }
        fzy b = b(dXRecyclerLayout);
        if (b == null || b.f() || i < 0 || i >= b.g()) {
            return false;
        }
        b.c(i);
        return true;
    }

    @Override // tb.gaf
    public ArrayList<DXWidgetNode> a(DXRecyclerLayout dXRecyclerLayout, List<Object> list, List<DXWidgetNode> list2, int i, int i2, n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("16906e33", new Object[]{this, dXRecyclerLayout, list, list2, new Integer(i), new Integer(i2), nVar}) : super.a(dXRecyclerLayout, list, list2, i, i2, nVar);
    }
}
