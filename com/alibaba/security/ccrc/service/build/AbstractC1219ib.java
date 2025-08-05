package com.alibaba.security.ccrc.service.build;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.ccrc.service.build.C1222jb;
import com.alibaba.security.wukong.bx.algo.BxData;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.mto;

/* renamed from: com.alibaba.security.ccrc.service.build.ib  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1219ib implements C1222jb.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final BxData.OpConfItemValue f3311a;

    /* renamed from: com.alibaba.security.ccrc.service.build.ib$a */
    /* loaded from: classes3.dex */
    public static class a extends AbstractC1219ib {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(BxData.OpConfItemValue opConfItemValue) {
            super(opConfItemValue);
        }

        @Override // com.alibaba.security.ccrc.service.build.C1222jb.a
        public Object a(String str, String str2, List<BxData.OpResult> list, C1222jb c1222jb) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("1e1ed239", new Object[]{this, str, str2, list, c1222jb});
            }
            List parseArray = JSON.parseArray(str2, String.class);
            int size = parseArray == null ? 0 : parseArray.size();
            BxData.OpConfItemValue opConfItemValue = this.f3311a;
            if (opConfItemValue.isKey) {
                list.add(new BxData.OpResult(opConfItemValue.name, Integer.valueOf(size), false));
            }
            c1222jb.a(String.valueOf(size));
            return c1222jb.b();
        }
    }

    /* renamed from: com.alibaba.security.ccrc.service.build.ib$b */
    /* loaded from: classes3.dex */
    public static class b extends AbstractC1219ib {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(BxData.OpConfItemValue opConfItemValue) {
            super(opConfItemValue);
        }

        @Override // com.alibaba.security.ccrc.service.build.C1222jb.a
        public Object a(String str, String str2, List<BxData.OpResult> list, C1222jb c1222jb) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("1e1ed239", new Object[]{this, str, str2, list, c1222jb});
            }
            list.add(new BxData.OpResult(this.f3311a.name, str, true));
            c1222jb.a(str2);
            return c1222jb.b();
        }
    }

    /* renamed from: com.alibaba.security.ccrc.service.build.ib$c */
    /* loaded from: classes3.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
            if (r0.equals("count") != false) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static com.alibaba.security.ccrc.service.build.AbstractC1219ib a(com.alibaba.security.wukong.bx.algo.BxData.OpConfItemValue r5) {
            /*
                Method dump skipped, instructions count: 300
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.security.ccrc.service.build.AbstractC1219ib.c.a(com.alibaba.security.wukong.bx.algo.BxData$OpConfItemValue):com.alibaba.security.ccrc.service.build.ib");
        }
    }

    /* renamed from: com.alibaba.security.ccrc.service.build.ib$e */
    /* loaded from: classes3.dex */
    public static class e extends AbstractC1219ib {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(BxData.OpConfItemValue opConfItemValue) {
            super(opConfItemValue);
        }

        @Override // com.alibaba.security.ccrc.service.build.C1222jb.a
        public Object a(String str, String str2, List<BxData.OpResult> list, C1222jb c1222jb) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("1e1ed239", new Object[]{this, str, str2, list, c1222jb});
            }
            List parseArray = JSON.parseArray(str2, String.class);
            Map map = (Map) JsonUtils.parseObject(this.f3311a.input, (Class<Object>) Map.class);
            String str3 = "";
            String str4 = map == null ? str3 : (String) map.get("sep");
            if (TextUtils.isEmpty(str4) || parseArray == null || parseArray.isEmpty()) {
                str3 = null;
            } else {
                int size = parseArray.size();
                Iterator it = parseArray.iterator();
                int i = 0;
                while (it.hasNext()) {
                    str3 = str3 + ((String) it.next());
                    if (i < size - 1) {
                        str3 = str3 + str4;
                    }
                    i++;
                }
            }
            BxData.OpConfItemValue opConfItemValue = this.f3311a;
            if (opConfItemValue.isKey) {
                list.add(new BxData.OpResult(opConfItemValue.name, str3, false));
            }
            c1222jb.a(str3);
            return c1222jb.b();
        }
    }

    /* renamed from: com.alibaba.security.ccrc.service.build.ib$f */
    /* loaded from: classes3.dex */
    public static class f extends AbstractC1219ib {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f(BxData.OpConfItemValue opConfItemValue) {
            super(opConfItemValue);
        }

        @Override // com.alibaba.security.ccrc.service.build.C1222jb.a
        public Object a(String str, String str2, List<BxData.OpResult> list, C1222jb c1222jb) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("1e1ed239", new Object[]{this, str, str2, list, c1222jb});
            }
            List parseArray = JSON.parseArray(str2, String.class);
            Collections.reverse(parseArray);
            BxData.OpConfItemValue opConfItemValue = this.f3311a;
            if (opConfItemValue.isKey) {
                list.add(new BxData.OpResult(opConfItemValue.name, parseArray, false));
            }
            c1222jb.a(JsonUtils.toJSONString(parseArray));
            return c1222jb.b();
        }
    }

    /* renamed from: com.alibaba.security.ccrc.service.build.ib$g */
    /* loaded from: classes3.dex */
    public static class g extends AbstractC1219ib {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g(BxData.OpConfItemValue opConfItemValue) {
            super(opConfItemValue);
        }

        @Override // com.alibaba.security.ccrc.service.build.C1222jb.a
        public Object a(String str, String str2, List<BxData.OpResult> list, C1222jb c1222jb) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("1e1ed239", new Object[]{this, str, str2, list, c1222jb});
            }
            Map map = (Map) JsonUtils.parseObject(this.f3311a.input, (Class<Object>) Map.class);
            List arrayList = new ArrayList();
            String str3 = map == null ? "" : (String) map.get("sep");
            if (TextUtils.isEmpty(str3) || !str2.contains(str3)) {
                arrayList.add(str2);
            } else {
                arrayList = Arrays.asList(str2.split(str3));
            }
            BxData.OpConfItemValue opConfItemValue = this.f3311a;
            if (opConfItemValue.isKey) {
                list.add(new BxData.OpResult(opConfItemValue.name, arrayList, false));
            }
            c1222jb.a(JsonUtils.toJSONString(arrayList));
            return c1222jb.b();
        }
    }

    /* renamed from: com.alibaba.security.ccrc.service.build.ib$h */
    /* loaded from: classes3.dex */
    public static class h extends AbstractC1219ib {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h(BxData.OpConfItemValue opConfItemValue) {
            super(opConfItemValue);
        }

        @Override // com.alibaba.security.ccrc.service.build.C1222jb.a
        public Object a(String str, String str2, List<BxData.OpResult> list, C1222jb c1222jb) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("1e1ed239", new Object[]{this, str, str2, list, c1222jb});
            }
            Map map = (Map) JsonUtils.parseObject(str2, (Class<Object>) Map.class);
            BxData.OpConfItemValue opConfItemValue = this.f3311a;
            if (opConfItemValue.isKey) {
                list.add(new BxData.OpResult(opConfItemValue.name, map, false));
            }
            c1222jb.a(JsonUtils.toJSONString(map));
            return c1222jb.b();
        }
    }

    /* renamed from: com.alibaba.security.ccrc.service.build.ib$i */
    /* loaded from: classes3.dex */
    public static class i extends AbstractC1219ib {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i(BxData.OpConfItemValue opConfItemValue) {
            super(opConfItemValue);
        }

        @Override // com.alibaba.security.ccrc.service.build.C1222jb.a
        public Object a(String str, String str2, List<BxData.OpResult> list, C1222jb c1222jb) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("1e1ed239", new Object[]{this, str, str2, list, c1222jb});
            }
            BxData.OpConfItemValue opConfItemValue = this.f3311a;
            if (opConfItemValue.isKey) {
                list.add(new BxData.OpResult(opConfItemValue.name, Double.valueOf(TextUtils.isEmpty(str2) ? mto.a.GEO_NOT_SUPPORT : Double.parseDouble(str2)), false));
            }
            c1222jb.a(str2);
            return c1222jb.b();
        }
    }

    /* renamed from: com.alibaba.security.ccrc.service.build.ib$j */
    /* loaded from: classes3.dex */
    public static class j extends AbstractC1219ib {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j(BxData.OpConfItemValue opConfItemValue) {
            super(opConfItemValue);
        }

        @Override // com.alibaba.security.ccrc.service.build.C1222jb.a
        public Object a(String str, String str2, List<BxData.OpResult> list, C1222jb c1222jb) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("1e1ed239", new Object[]{this, str, str2, list, c1222jb});
            }
            List parseArray = JSON.parseArray(str2, String.class);
            BxData.OpConfItemValue opConfItemValue = this.f3311a;
            if (opConfItemValue.isKey) {
                list.add(new BxData.OpResult(opConfItemValue.name, parseArray, false));
            }
            c1222jb.a(JsonUtils.toJSONString(parseArray));
            return c1222jb.b();
        }
    }

    /* renamed from: com.alibaba.security.ccrc.service.build.ib$k */
    /* loaded from: classes3.dex */
    public static class k extends AbstractC1219ib {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k(BxData.OpConfItemValue opConfItemValue) {
            super(opConfItemValue);
        }

        @Override // com.alibaba.security.ccrc.service.build.C1222jb.a
        public Object a(String str, String str2, List<BxData.OpResult> list, C1222jb c1222jb) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("1e1ed239", new Object[]{this, str, str2, list, c1222jb});
            }
            BxData.OpConfItemValue opConfItemValue = this.f3311a;
            if (opConfItemValue.isKey) {
                list.add(new BxData.OpResult(opConfItemValue.name, Long.valueOf(TextUtils.isEmpty(str2) ? 0L : Long.parseLong(str2)), false));
            }
            c1222jb.a(str2);
            return c1222jb.b();
        }
    }

    /* renamed from: com.alibaba.security.ccrc.service.build.ib$l */
    /* loaded from: classes3.dex */
    public static class l extends AbstractC1219ib {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public l(BxData.OpConfItemValue opConfItemValue) {
            super(opConfItemValue);
        }

        @Override // com.alibaba.security.ccrc.service.build.C1222jb.a
        public Object a(String str, String str2, List<BxData.OpResult> list, C1222jb c1222jb) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("1e1ed239", new Object[]{this, str, str2, list, c1222jb});
            }
            Collection parseArray = JSON.parseArray(str2, String.class);
            if (parseArray == null) {
                parseArray = new ArrayList();
            }
            ArrayList arrayList = new ArrayList(new HashSet(parseArray));
            BxData.OpConfItemValue opConfItemValue = this.f3311a;
            if (opConfItemValue.isKey) {
                list.add(new BxData.OpResult(opConfItemValue.name, arrayList, false));
            }
            c1222jb.a(JsonUtils.toJSONString(arrayList));
            return c1222jb.b();
        }
    }

    public AbstractC1219ib(BxData.OpConfItemValue opConfItemValue) {
        this.f3311a = opConfItemValue;
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (char c2 : str.toCharArray()) {
            if (!Character.isDigit(c2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: com.alibaba.security.ccrc.service.build.ib$d */
    /* loaded from: classes3.dex */
    public static class d extends AbstractC1219ib {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(BxData.OpConfItemValue opConfItemValue) {
            super(opConfItemValue);
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // com.alibaba.security.ccrc.service.build.C1222jb.a
        public Object a(String str, String str2, List<BxData.OpResult> list, C1222jb c1222jb) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("1e1ed239", new Object[]{this, str, str2, list, c1222jb});
            }
            List<Object> parseArray = JSON.parseArray(str2, Object.class);
            if (parseArray == null) {
                parseArray = new ArrayList<>();
            }
            Map map = (Map) JsonUtils.parseObject(this.f3311a.input, (Class<Object>) Map.class);
            Object a2 = a(parseArray, map == null ? 0 : ((Integer) map.get("type")).intValue());
            if (a2 != null) {
                BxData.OpConfItemValue opConfItemValue = this.f3311a;
                if (opConfItemValue.isKey) {
                    list.add(new BxData.OpResult(opConfItemValue.name, a2, false));
                }
                c1222jb.a(JsonUtils.toJSONString(a2));
            }
            return c1222jb.b();
        }

        private Object a(List<Object> list, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("e6698fa8", new Object[]{this, list, new Integer(i)});
            }
            if (list.size() == 0) {
                return null;
            }
            if (i == 1) {
                ArrayList arrayList = new ArrayList();
                Iterator<Object> it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (a(str)) {
                        arrayList.add(Long.valueOf(Long.parseLong(str)));
                    }
                }
                return arrayList;
            } else if (i != 2) {
                return null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Iterator<Object> it2 = list.iterator();
                while (it2.hasNext()) {
                    String str2 = (String) it2.next();
                    if (!a(str2)) {
                        arrayList2.add(str2);
                    }
                }
                return arrayList2;
            }
        }
    }
}
