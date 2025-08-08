package tb;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tracker.page.page.data.AttrArg;
import com.taobao.android.tracker.page.page.data.ConfData;
import com.taobao.android.tracker.page.page.data.Intercepts;
import com.taobao.android.tracker.page.page.data.Point;
import com.taobao.android.tracker.util.TrackerType;
import com.taobao.android.tracker.util.a;
import com.taobao.android.tracker.util.d;
import com.taobao.android.tracker.util.g;
import com.taobao.android.tracker.util.i;
import com.taobao.weex.dom.WXAttr;
import com.taobao.weex.ui.component.WXComponent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class jjl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private jja f29585a;
    private String b;
    private String c;
    private boolean d;
    private String f;
    private String l;
    private String m;
    private String n;
    private String o;
    private boolean e = false;
    private Map<String, Point> g = new HashMap();
    private Map<String, Point> h = new HashMap();
    private Map<String, Map<String, Point>> i = new HashMap();
    private Map<String[], Point> j = new HashMap();
    private Map<String[], Map<String[], Point>> k = new HashMap();
    private boolean p = true;
    private boolean q = false;
    private boolean r = false;

    static {
        kge.a(-1387450119);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            j();
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        ConfData confData = (ConfData) a.a(str, ConfData.class);
        if (confData == null) {
            return;
        }
        e(confData.getIntercept());
        confData.getRule();
        this.e = true;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.e;
    }

    private String b(Point point, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f09a37d1", new Object[]{this, point, view});
        }
        String str = null;
        if (point != null) {
            str = point.getSpmD();
        }
        String a2 = i.a(view, "index", true);
        if (StringUtils.isEmpty(a2)) {
            a2 = i.a(view, i.ATTR_KEY_DATA_POINT_INDEX, true);
        }
        return d.a(str, a2);
    }

    private Map<String, String> a(List<AttrArg> list, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("295b194e", new Object[]{this, list, view});
        }
        HashMap hashMap = new HashMap();
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AttrArg attrArg = list.get(i);
                if (attrArg != null) {
                    String a2 = a(view, attrArg);
                    String commitKey = attrArg.getCommitKey();
                    if (!StringUtils.isEmpty(commitKey) && !StringUtils.isEmpty(a2)) {
                        hashMap.put(commitKey, a2);
                    }
                }
            }
        }
        return hashMap;
    }

    private Map<String, String> c(Point point, View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("1a8e15e5", new Object[]{this, point, view}) : a(point.getAttrArgs(), view);
    }

    private Map<String, String> d(Point point, View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("89152726", new Object[]{this, point, view}) : a(point.getClickAttrArgs(), view);
    }

    private Map<String, String> e(Point point, View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("f79c3867", new Object[]{this, point, view}) : a(point.getJumpAttrArgs(), view);
    }

    private Map<String, String> f(Point point, View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("662349a8", new Object[]{this, point, view}) : a(point.getExpourseAttrArgs(), view);
    }

    public Map<String, String> a(Point point) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("b2ad47d9", new Object[]{this, point}) : a.a(point.getCustomArgs());
    }

    private String a(View view, AttrArg attrArg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ddf6f213", new Object[]{this, view, attrArg});
        }
        if (attrArg == null) {
            return null;
        }
        return i.a(view, attrArg.getAttrName(), attrArg.isRecursive());
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (this.f29585a != null) {
        } else {
            this.f29585a = new jja();
        }
    }

    private void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            a((Intercepts) a.a(str, Intercepts.class));
        }
    }

    private void a(Intercepts intercepts) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3120db4b", new Object[]{this, intercepts});
        } else if (intercepts == null) {
        } else {
            b(intercepts.getSpmA());
            c(intercepts.getSpmB());
            c(intercepts.getEnableMatchKey());
            d(intercepts.getEnableMatchKey());
            a(intercepts.getPoints());
            b(intercepts.getEnabled());
            d(intercepts.getLogkey());
            a(intercepts.isNeedExposureBackView());
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.p;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.p = z;
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.d;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public String a(Point point, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c9bd0f2", new Object[]{this, point, str});
        }
        if (!StringUtils.isEmpty(this.m)) {
            return this.m;
        }
        if (point != null && !StringUtils.isEmpty(point.getSpmB())) {
            return point.getSpmB();
        }
        return this.c;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        if (!StringUtils.isEmpty(this.l)) {
            return this.l;
        }
        return this.b;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.f;
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    private void a(List<Point> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Point point = list.get(i);
                if (point != null) {
                    c(point);
                }
            }
        }
    }

    public String a(Point point, String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba7d087c", new Object[]{this, point, str, view});
        }
        String str2 = null;
        if (point != null) {
            if (!StringUtils.isEmpty(point.getArg1())) {
                str2 = point.getArg1();
            } else if (!StringUtils.isEmpty(point.getLogkey())) {
                str2 = point.getLogkey();
            } else {
                str2 = f();
            }
        }
        return StringUtils.isEmpty(str2) ? d.a(e(), a(point, str), a(point, view), "") : str2;
    }

    private void c(Point point) {
        String[] a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c33121e2", new Object[]{this, point});
        } else if (point == null) {
        } else {
            String[] a3 = a(point.getSelector(), ":");
            if (a3 != null && a3.length > 0) {
                if (a3.length > 1) {
                    if (!StringUtils.isEmpty(a3[0]) && !StringUtils.isEmpty(a3[1])) {
                        if (this.i.get(a3[1]) != null) {
                            this.i.get(a3[1]).put(a3[0], point);
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put(a3[0], point);
                            this.i.put(a3[1], hashMap);
                        }
                    }
                } else if (!StringUtils.isEmpty(a3[0])) {
                    this.h.put(a3[0], point);
                }
            }
            jjj d = com.taobao.android.tracker.a.a().d();
            if (d == null || !d.b() || !this.q) {
                return;
            }
            String selector = point.getSelector();
            if (StringUtils.isEmpty(selector)) {
                return;
            }
            if (selector.startsWith("#") && selector.length() > 1) {
                this.g.put(selector, point);
            } else if (!selector.startsWith(".") || selector.length() <= 1 || (a2 = a(selector, " ")) == null || a2.length == 0) {
            } else {
                if (a2.length > 1) {
                    String[] a4 = a(a(a2[0], "\\."));
                    String[] a5 = a(a(a2[1], "\\."));
                    if (a5 == null || a4 == null) {
                        return;
                    }
                    Map a6 = a(a5, this.k);
                    if (a6 != null) {
                        a6.put(a4, point);
                        return;
                    }
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(a4, point);
                    this.k.put(a5, hashMap2);
                    return;
                }
                String[] a7 = a(a(a2[0], "\\."));
                if (a7 == null) {
                    return;
                }
                this.j.put(a7, point);
            }
        }
    }

    private Map a(String[] strArr, Map<String[], Map<String[], Point>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3a8d80a3", new Object[]{this, strArr, map});
        }
        if (strArr != null && strArr.length != 0 && map != null && map.size() != 0) {
            Iterator<Map.Entry<String[], Map<String[], Point>>> it = map.entrySet().iterator();
            while (it != null && it.hasNext()) {
                Map.Entry<String[], Map<String[], Point>> next = it.next();
                String[] key = next.getKey();
                if (key != null && key.length > 0 && Arrays.equals(key, strArr)) {
                    return next.getValue();
                }
            }
        }
        return null;
    }

    private String[] a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("76f063c6", new Object[]{this, strArr});
        }
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < strArr.length; i++) {
            if (!StringUtils.isEmpty(strArr[i])) {
                arrayList.add("." + strArr[i]);
            }
        }
        if (arrayList.size() > 0) {
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        return null;
    }

    public jjk a(View view, String str, TrackerType trackerType) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jjk) ipChange.ipc$dispatch("780980fd", new Object[]{this, view, str, trackerType}) : b(view, str, trackerType);
    }

    private jjk b(View view, String str, TrackerType trackerType) {
        Point a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jjk) ipChange.ipc$dispatch("47c9b49c", new Object[]{this, view, str, trackerType});
        }
        jjk jjkVar = null;
        if (trackerType != null && trackerType == TrackerType.TrackerType_Click) {
            a2 = b(view, trackerType);
        } else {
            a2 = (trackerType == null || trackerType != TrackerType.TrackerType_Exposure) ? null : a(view, trackerType);
        }
        if (a2 != null) {
            jjkVar = new jjk();
            jjkVar.f = b(a2, str, view);
            jjkVar.f29584a = e();
            jjkVar.b = a(a2, str);
            jjkVar.c = a(a2, view);
            jjkVar.d = b(a2, view);
            jjkVar.e = b(a2);
            jjkVar.k = a2.getTrackerType();
            Map<String, String> d = d(a2, view);
            Map<String, String> e = e(a2, view);
            Map<String, String> f = f(a2, view);
            jjkVar.h = d;
            jjkVar.i = e;
            jjkVar.j = f;
            HashMap hashMap = new HashMap();
            Map<String, String> c = c(a2, view);
            Map<String, String> a3 = a(a2);
            if (a3 != null) {
                hashMap.putAll(a3);
            }
            if (c != null) {
                hashMap.putAll(c);
            }
            String jumpSpmKey = (trackerType == null || trackerType != TrackerType.TrackerType_Click || StringUtils.isEmpty(a2.getJumpSpmKey())) ? "spm" : a2.getJumpSpmKey();
            String a4 = d.a(jjkVar);
            if (!StringUtils.isEmpty(a4) && !StringUtils.isEmpty(jumpSpmKey)) {
                hashMap.put(jumpSpmKey, a4);
            }
            jjkVar.g = hashMap;
        }
        return jjkVar;
    }

    private Point a(View view, TrackerType trackerType) {
        Point point;
        Point point2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("9017ea44", new Object[]{this, view, trackerType});
        }
        if (view == null) {
            return null;
        }
        String a2 = i.a(view, i.ATTR_KEY_DATA_TRACKER);
        if (!StringUtils.isEmpty(a2) && (point2 = this.h.get(a2)) != null && g.a(trackerType, point2.getTrackerType())) {
            return point2;
        }
        Point a3 = a(view, a2, i.ATTR_KEY_DATA_TRACKER, this.i);
        if (a3 != null && g.a(trackerType, a3.getTrackerType())) {
            return a3;
        }
        Object tag = view.getTag(jjj.TAG_DYNAMIC_TRACKER_VIEW_ENABLE_MATCH_KEY);
        if ((tag instanceof Boolean) && ((Boolean) tag).booleanValue()) {
            String a4 = i.a(view, "id");
            if (!StringUtils.isEmpty(a4)) {
                Map<String, Point> map = this.g;
                Point point3 = map.get("#" + a4);
                if (point3 != null && g.a(trackerType, point3.getTrackerType())) {
                    return point3;
                }
            }
            String[] a5 = a(i.a(view, "class"), " ");
            if (a5 != null && (point = (Point) b(a5, this.j)) != null && g.a(trackerType, point.getTrackerType())) {
                return point;
            }
            a3 = a(view, a5, "class", this.k);
            if (a3 == null || g.a(trackerType, a3.getTrackerType())) {
            }
        }
        return a3;
    }

    private Point b(View view, TrackerType trackerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("dcc613c5", new Object[]{this, view, trackerType});
        }
        if (view == null) {
            return null;
        }
        while (view != null) {
            Point a2 = a(view, trackerType);
            if (a2 != null && g.a(trackerType, a2.getTrackerType())) {
                return a2;
            }
            view = i.a(view);
        }
        return null;
    }

    private Object b(String[] strArr, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d3253ce3", new Object[]{this, strArr, map});
        }
        Object obj = null;
        if (strArr != null && map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String[] strArr2 = (String[]) entry.getKey();
                int i = 0;
                for (int i2 = 0; i2 < strArr2.length && a(strArr, strArr2[i2]); i2++) {
                    i++;
                }
                if (i == strArr2.length) {
                    obj = entry.getValue();
                }
            }
        }
        return obj;
    }

    private boolean a(String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a325b9c5", new Object[]{this, strArr, str})).booleanValue();
        }
        if (strArr != null && !StringUtils.isEmpty(str)) {
            for (String str2 : strArr) {
                if (('.' + str2).equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    private String[] a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("66657a4b", new Object[]{this, str, str2});
        }
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
            return str.split(str2);
        }
        return null;
    }

    private Point a(View view, String str, String str2, Map<String, Map<String, Point>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("1c70bb83", new Object[]{this, view, str, str2, map});
        }
        if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2) || map == null) {
            return null;
        }
        Map<String, Point> map2 = map.get(str);
        if (map2 == null || map2.size() == 0) {
            return null;
        }
        for (WXComponent b = i.b(view); b != null; b = b.getParent()) {
            WXAttr a2 = i.a(b);
            String a3 = a2 != null ? i.a(a2, str2) : null;
            if (!StringUtils.isEmpty(a3) && map2.containsKey(a3)) {
                return map2.get(a3);
            }
        }
        return null;
    }

    private Point a(View view, String[] strArr, String str, Map<String[], Map<String[], Point>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("9606fee2", new Object[]{this, view, strArr, str, map});
        }
        if (strArr != null && !StringUtils.isEmpty(str) && map != null) {
            WXComponent b = i.b(view);
            Map map2 = (Map) b(strArr, map);
            if (map2 != null && map2.size() != 0) {
                Point point = null;
                while (b != null) {
                    WXAttr a2 = i.a(b);
                    String[] a3 = a2 != null ? a(i.a(a2, str), " ") : null;
                    if (a3 != null) {
                        point = (Point) b(a3, map2);
                        if (point != null) {
                            break;
                        }
                        b = b.getParent();
                    } else {
                        b = b.getParent();
                    }
                }
                return point;
            }
        }
        return null;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.n;
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null) {
        } else {
            if (map.containsKey("url")) {
                String str = map.get("url");
                if (!StringUtils.isEmpty(str)) {
                    this.o = a.b(str);
                }
            }
            if (map.containsKey("pageName")) {
                this.n = map.get("pageName");
            }
            if (map.containsKey(jjj.SPM_A)) {
                this.l = map.get(jjj.SPM_A);
            }
            if (!map.containsKey(jjj.SPM_B)) {
                return;
            }
            this.m = map.get(jjj.SPM_B);
        }
    }

    public String b(Point point) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a1ecdfbd", new Object[]{this, point});
        }
        String g = g();
        return (StringUtils.isEmpty(g) && point != null && !StringUtils.isEmpty(point.getPageName())) ? point.getPageName() : g;
    }

    public String b(Point point, String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7faef9db", new Object[]{this, point, str, view});
        }
        if (point == null) {
            return null;
        }
        return a(point, str, view);
    }

    public String a(Point point, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8a95cb2", new Object[]{this, point, view});
        }
        if (point != null && !StringUtils.isEmpty(point.getSpmC())) {
            return point.getSpmC();
        }
        return i.b(view, i.ATTR_KEY_DATA_SPM);
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.q;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.q = z;
        }
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.r;
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.r = z;
        }
    }
}
