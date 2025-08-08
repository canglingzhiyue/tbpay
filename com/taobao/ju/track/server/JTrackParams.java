package com.taobao.ju.track.server;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes7.dex */
public class JTrackParams extends HashMap<String, String> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_SPLIT = ",";
    public static final String TRACK_PARAMS = "trackParams";
    public static final String TRACK_PARAMS_CLICK = "_click";
    public static final String TRACK_PARAMS_DETAIL_EXPOSE = "_detailExpose";
    public static final String TRACK_PARAMS_DOUBLE_CLICK = "_doubleClick";
    public static final String TRACK_PARAMS_EXPOSE = "_expose";
    public static final String TRACK_PARAMS_ID = "_trackId";
    public static final String TRACK_PARAMS_NAME = "_trackName";

    public static JTrackParams addAll(JTrackParams jTrackParams, JTrackParams jTrackParams2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JTrackParams) ipChange.ipc$dispatch("77c207da", new Object[]{jTrackParams, jTrackParams2});
        }
        if (jTrackParams == null) {
            return jTrackParams2;
        }
        if (jTrackParams2 != null) {
            jTrackParams.putAll(jTrackParams2);
        }
        return jTrackParams;
    }

    public static JTrackParams create(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JTrackParams) ipChange.ipc$dispatch("cb2e840", new Object[]{jSONObject});
        }
        if (jSONObject != null && jSONObject.containsKey(TRACK_PARAMS)) {
            return create(jSONObject.getString(TRACK_PARAMS));
        }
        return null;
    }

    public static JTrackParams create(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JTrackParams) ipChange.ipc$dispatch("ee66af00", new Object[]{str});
        }
        try {
            if (StringUtils.isEmpty(str)) {
                return null;
            }
            return (JTrackParams) JSON.parseObject(str, JTrackParams.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static JTrackParams create(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JTrackParams) ipChange.ipc$dispatch("1fd0bd15", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        try {
            JTrackParams jTrackParams = new JTrackParams();
            jTrackParams.putAll(map);
            return jTrackParams;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static JTrackParams createFromObjMap(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JTrackParams) ipChange.ipc$dispatch("ec8d8966", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        try {
            JTrackParams jTrackParams = new JTrackParams();
            for (String str : map.keySet()) {
                jTrackParams.put(str, String.valueOf(map.get(str)));
            }
            return jTrackParams;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void setFields(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("349f80d6", new Object[]{this, str, str2});
        } else {
            put(str, str2);
        }
    }

    public String getAllKeys() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de84355a", new Object[]{this});
        }
        StringBuffer stringBuffer = new StringBuffer();
        Set<String> keySet = keySet();
        if (keySet != null) {
            for (String str : keySet) {
                if (str != null && !str.startsWith("_")) {
                    stringBuffer.append(str);
                    stringBuffer.append(",");
                }
            }
        }
        if (stringBuffer.length() > 1) {
            stringBuffer = stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        return stringBuffer.toString();
    }

    public static Map<String, String> getClickParams(JTrackParams jTrackParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d0463719", new Object[]{jTrackParams});
        }
        Map<String, String> params = getParams(jTrackParams, TRACK_PARAMS_CLICK);
        String trackId = getTrackId(jTrackParams);
        String trackName = getTrackName(jTrackParams);
        if (trackId != null || trackName != null) {
            if (params == null) {
                params = new HashMap<>();
            }
            params.put(TRACK_PARAMS_ID, trackId);
            params.put(TRACK_PARAMS_NAME, trackName);
        }
        return params;
    }

    public static Map<String, String> getDoubleClickParams(JTrackParams jTrackParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("565e25ca", new Object[]{jTrackParams});
        }
        Map<String, String> params = getParams(jTrackParams, TRACK_PARAMS_DOUBLE_CLICK);
        String trackId = getTrackId(jTrackParams);
        String trackName = getTrackName(jTrackParams);
        if (trackId != null || trackName != null) {
            if (params == null) {
                params = new HashMap<>();
            }
            params.put(TRACK_PARAMS_ID, trackId);
            params.put(TRACK_PARAMS_NAME, trackName);
        }
        return params;
    }

    public static Map<String, String> getExposeParams(JTrackParams jTrackParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("48460931", new Object[]{jTrackParams}) : getParams(jTrackParams, TRACK_PARAMS_EXPOSE);
    }

    public static Map<String, String> getDetailExposeParams(JTrackParams jTrackParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("dd0c4420", new Object[]{jTrackParams}) : getParams(jTrackParams, TRACK_PARAMS_DETAIL_EXPOSE);
    }

    public static Serializable getSerializableDetailExposeParams(JTrackParams jTrackParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Serializable) ipChange.ipc$dispatch("9924a23e", new Object[]{jTrackParams}) : (Serializable) getDetailExposeParams(jTrackParams);
    }

    public static String getTrackId(JTrackParams jTrackParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("85409ed4", new Object[]{jTrackParams}) : getParam(jTrackParams, TRACK_PARAMS_ID);
    }

    public static String getTrackName(JTrackParams jTrackParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6c9f0f04", new Object[]{jTrackParams}) : getParam(jTrackParams, TRACK_PARAMS_NAME);
    }

    private static Map<String, String> getParams(JTrackParams jTrackParams, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6f052c5f", new Object[]{jTrackParams, str});
        }
        if (jTrackParams == null || !jTrackParams.containsKey(str)) {
            return null;
        }
        String str2 = jTrackParams.get(str);
        if (StringUtils.isEmpty(str2)) {
            return null;
        }
        return getParams(jTrackParams, str2.split(","));
    }

    private static Map<String, String> getParams(JTrackParams jTrackParams, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c1e9d734", new Object[]{jTrackParams, strArr});
        }
        if (jTrackParams == null || strArr == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : strArr) {
            String trim = str.trim();
            if (jTrackParams.containsKey(trim)) {
                hashMap.put(trim, jTrackParams.get(trim));
            }
        }
        return hashMap;
    }

    private static String getParam(JTrackParams jTrackParams, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77ace691", new Object[]{jTrackParams, str});
        }
        if (jTrackParams != null && jTrackParams.containsKey(str)) {
            return jTrackParams.get(str);
        }
        return null;
    }
}
