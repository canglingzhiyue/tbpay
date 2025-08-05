package tb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.poplayer.exception.PoplayerException;
import com.alibaba.poplayer.utils.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.nativerender.b;
import com.taobao.tbpoplayer.nativerender.d;
import com.taobao.tbpoplayer.nativerender.dsl.ConditionModel;
import com.taobao.tbpoplayer.nativerender.e;
import com.taobao.tbpoplayer.nativerender.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class qnu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1999180375);
    }

    /* renamed from: lambda$uT8rSoUQ3S-b6lVP27Fz6pVDVqk */
    public static /* synthetic */ void m2489lambda$uT8rSoUQ3Sb6lVP27Fz6pVDVqk(String str, e eVar) {
        a(str, eVar);
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue() : TextUtils.isEmpty(str) ? z : !str.contains("null") && !str.contains("undefined");
    }

    public static void a(final e eVar, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caf5dff0", new Object[]{eVar, str});
        } else if (!a(str, false) || eVar == null) {
        } else {
            eVar.a(new Runnable() { // from class: tb.-$$Lambda$qnu$uT8rSoUQ3S-b6lVP27Fz6pVDVqk
                @Override // java.lang.Runnable
                public final void run() {
                    qnu.m2489lambda$uT8rSoUQ3Sb6lVP27Fz6pVDVqk(str, eVar);
                }
            });
        }
    }

    public static /* synthetic */ void a(String str, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a911cbf0", new Object[]{str, eVar});
            return;
        }
        try {
            jao a2 = jao.a();
            if (a2 != null) {
                a2.a(str, new jzb() { // from class: tb.qnu.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.jzb, tb.gml
                    public void a(ErrorResult errorResult) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("57a5ed5e", new Object[]{this, errorResult});
                        }
                    }
                });
            } else {
                Toast.makeText(eVar.a().a(), str, 0).show();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static int a(e eVar, List<JSONObject> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1850b110", new Object[]{eVar, list, new Boolean(z)})).intValue();
        }
        if (list == null || list.isEmpty()) {
            return 0;
        }
        int i = 0;
        for (JSONObject jSONObject : list) {
            String string = jSONObject.getString("type");
            ConditionModel conditionModel = (ConditionModel) jSONObject.getObject("vCondition", ConditionModel.class);
            if (conditionModel != null) {
                boolean a2 = b.a(conditionModel, eVar, false);
                jSONObject.put("vConditionResult", (Object) Boolean.valueOf(a2));
                if (a2) {
                }
            }
            if (eVar.a().c() == 0 && "Video".equals(string)) {
                i++;
            }
            if ((z && qnt.TYPE_CLOSE_BTN.equals(string)) || qnt.TYPE_IMAGE.equals(string)) {
                i++;
            } else if (qnt.TYPE_BLOCK.equals(string)) {
                List list2 = (List) JSON.parseObject(jSONObject.getString("children"), new TypeReference<ArrayList<JSONObject>>() { // from class: tb.qnu.2
                }.getType(), new Feature[0]);
                int a3 = a(eVar, list2, z);
                jSONObject.put("children", JSON.toJSON(list2));
                i += a3;
            }
        }
        return i;
    }

    public static int b(e eVar, String str) throws PoplayerException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("856b8064", new Object[]{eVar, str})).intValue();
        }
        try {
            if ("100%".equals(str)) {
                return -1;
            }
            if ("auto".equals(str)) {
                return -2;
            }
            Float c = p.c(eVar, str);
            if (c == null) {
                return 0;
            }
            return (int) eVar.l().a(eVar.a().a(), c.floatValue());
        } catch (Throwable th) {
            c.a("transWidthAndHeight.error.", th);
            eVar.a("transWidthAndHeightError.size=" + str, String.valueOf(th.getMessage()));
            return 0;
        }
    }

    public static String a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4dcf7ed", new Object[]{str, map});
        }
        try {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            for (String str2 : map.keySet()) {
                buildUpon.appendQueryParameter(str2, map.get(str2));
            }
            buildUpon.build();
            return buildUpon.toString();
        } catch (Throwable th) {
            c.a("appendParamsUri.error.", th);
            return str;
        }
    }

    public static Bitmap a(d dVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("fd526c09", new Object[]{dVar, view});
        }
        int u = dVar.u();
        int v = dVar.v();
        view.measure(u, v);
        view.layout(0, 0, u, v);
        Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }
}
