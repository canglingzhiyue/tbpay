package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.home.component.utils.h;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubSectionModel;
import java.util.Map;

/* loaded from: classes7.dex */
public class lob extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HICONOVERLAYGETDATA = 8978819794289704064L;

    static {
        kge.a(196435073);
    }

    public static /* synthetic */ Object ipc$super(lob lobVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length >= 2) {
            String valueOf = String.valueOf(objArr[0]);
            String valueOf2 = String.valueOf(objArr[1]);
            String valueOf3 = objArr.length >= 3 ? String.valueOf(objArr[2]) : null;
            BaseSectionModel<?> b = lfq.b(dXRuntimeContext);
            if (b == null || !TextUtils.equals(valueOf, b.getSectionBizCode())) {
                ldf.d("DXDataParserHIconOverlayGetData", "not current widget!");
            } else {
                JSONObject jSONObject = b.getExt().getJSONObject("clientCache");
                if (jSONObject == null) {
                    b.getExt().put("clientCache", (Object) new JSONObject());
                }
                if (jSONObject.containsKey("currentIndex")) {
                    i = jSONObject.getInteger("currentIndex").intValue();
                }
                JSONObject a2 = a(b, jSONObject.containsKey("beReplacedBiz") ? jSONObject.getString("beReplacedBiz") : "", jSONObject, i);
                if (a2 != null) {
                    jSONObject.put(valueOf2, (Object) a2);
                }
                if (TextUtils.equals(valueOf3, "finish")) {
                    jSONObject.put("currentIndex", (Object) Integer.valueOf(i + 1));
                    a(a2, b.getArgs());
                }
                return a2;
            }
        }
        return null;
    }

    private void a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f32d068", new Object[]{this, jSONObject, jSONObject2});
        } else if (jSONObject != null && jSONObject.containsKey(h.TRACK_EXPOSURE_PARAM)) {
            try {
                JSONObject jSONObject3 = (JSONObject) jSONObject.getJSONObject(h.TRACK_EXPOSURE_PARAM).clone();
                JSONObject jSONObject4 = jSONObject3.getJSONObject("args");
                if (jSONObject4 == null) {
                    jSONObject3.put("args", (Object) jSONObject2);
                } else {
                    boolean equals = "1".equals(jSONObject2.getString("argsType"));
                    for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                        if (equals) {
                            if (!jSONObject4.containsKey(entry.getKey())) {
                                jSONObject4.put(entry.getKey(), entry.getValue());
                            }
                        } else {
                            jSONObject4.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                ljh.a(jSONObject3, (JSONObject) null);
            } catch (Throwable th) {
                ldf.a("DXDataParserHIconOverlayGetData", "AutoExposureUtils", th);
            }
        }
    }

    private JSONObject a(BaseSectionModel<?> baseSectionModel, String str, JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("14a93a2d", new Object[]{this, baseSectionModel, str, jSONObject, new Integer(i)});
        }
        try {
            JSONObject a2 = a(baseSectionModel);
            if (a2 == null) {
                ldf.d("DXDataParserHIconOverlayGetData", "no iconOverlay found!");
                return null;
            }
            JSONObject jSONObject2 = a2.getJSONObject("item");
            if (jSONObject2 != null && jSONObject2.size() >= i) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(String.valueOf(i));
                return (jSONObject3 == null || TextUtils.equals(str, jSONObject3.getString("itemBizCode"))) ? a(i, jSONObject, jSONObject2, a2.getJSONObject("ext").getInteger("itemCount").intValue()) : jSONObject3;
            }
            ldf.d("DXDataParserHIconOverlayGetData", "no enough item!");
            return null;
        } catch (Throwable th) {
            ldf.d("DXDataParserHIconOverlayGetData", "get item failed" + th.toString());
            return null;
        }
    }

    private JSONObject a(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a33498d0", new Object[]{this, baseSectionModel});
        }
        BaseSubSectionModel mo1098getSubSection = baseSectionModel.mo1098getSubSection();
        if (mo1098getSubSection == null || mo1098getSubSection.isEmpty()) {
            ldf.d("DXDataParserHIconOverlayGetData", "no subSection found!");
            return null;
        }
        return (JSONObject) mo1098getSubSection.get("iconOverlay");
    }

    private JSONObject a(int i, JSONObject jSONObject, JSONObject jSONObject2, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("150cfaa8", new Object[]{this, new Integer(i), jSONObject, jSONObject2, new Integer(i2)});
        }
        int i3 = i + 1;
        if (i3 >= i2) {
            i3 = 0;
        }
        jSONObject.put("currentIndex", (Object) Integer.valueOf(i3));
        return jSONObject2.getJSONObject(String.valueOf(i3));
    }
}
