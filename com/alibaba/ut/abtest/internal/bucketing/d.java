package com.alibaba.ut.abtest.internal.bucketing;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.evo.internal.bucketing.model.ExperimentGroupV5;
import com.alibaba.evo.internal.bucketing.model.ExperimentV5;
import com.alibaba.ut.abtest.internal.bucketing.model.ExperimentType;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.cex;
import tb.cez;
import tb.kge;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<String, List<ExperimentV5>> f4185a = new ConcurrentHashMap<>();
    private final List<ExperimentV5> b = new ArrayList();
    private final Object c = new Object();
    private final Object d = new Object();
    private final String e = "<PATH-EMPTY>";

    static {
        kge.a(1136458023);
    }

    public void a(Uri uri, ExperimentV5 experimentV5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5deaf6a9", new Object[]{this, uri, experimentV5});
            return;
        }
        String a2 = a(uri, "<PATH-EMPTY>");
        if (a(a2)) {
            synchronized (this.c) {
                this.b.add(experimentV5);
            }
            return;
        }
        List<ExperimentV5> list = this.f4185a.get(a2);
        if (list == null) {
            synchronized (this.d) {
                if (list == null) {
                    list = new ArrayList<>();
                    this.f4185a.put(a2, list);
                }
            }
        }
        synchronized (list) {
            list.add(experimentV5);
        }
    }

    private ExperimentV5 a(ExperimentV5 experimentV5, Uri uri) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentV5) ipChange.ipc$dispatch("23acddf", new Object[]{this, experimentV5, uri});
        }
        Iterator<ExperimentGroupV5> it = experimentV5.getGroups().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            ExperimentGroupV5 next = it.next();
            if (next.getIgnoreUris() != null && !next.getIgnoreUris().isEmpty()) {
                z = true;
                break;
            }
        }
        if (!z) {
            return experimentV5;
        }
        ArrayList arrayList = new ArrayList();
        for (ExperimentGroupV5 experimentGroupV5 : experimentV5.getGroups()) {
            if (experimentGroupV5.getIgnoreUris() == null || experimentGroupV5.getIgnoreUris().isEmpty()) {
                arrayList.add(experimentGroupV5);
            } else {
                Iterator<Uri> it2 = experimentGroupV5.getIgnoreUris().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (b(it2.next(), uri)) {
                            z2 = true;
                            break;
                        }
                    } else {
                        z2 = false;
                        break;
                    }
                }
                if (!z2) {
                    arrayList.add(experimentGroupV5);
                }
            }
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        if (arrayList.size() == experimentV5.getGroups().size()) {
            return experimentV5;
        }
        ExperimentV5 copyBasicInfo = experimentV5.copyBasicInfo();
        copyBasicInfo.setGroups(arrayList);
        return copyBasicInfo;
    }

    public List<ExperimentV5> a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1cf8f288", new Object[]{this, uri});
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        synchronized (this.c) {
            for (ExperimentV5 experimentV5 : this.b) {
                if (b(experimentV5.getUri(), uri)) {
                    arrayList2.add(experimentV5);
                }
            }
        }
        if (arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ExperimentV5 experimentV52 = (ExperimentV5) it.next();
                if (experimentV52.getType() == ExperimentType.Redirect) {
                    ExperimentV5 a2 = a(experimentV52, uri);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                } else {
                    arrayList.add(experimentV52);
                }
            }
        }
        List<ExperimentV5> list = this.f4185a.get(a(uri, "<PATH-EMPTY>"));
        if (list != null && !list.isEmpty()) {
            synchronized (list) {
                for (ExperimentV5 experimentV53 : list) {
                    if (b(experimentV53.getUri(), uri)) {
                        if (experimentV53.getType() == ExperimentType.Redirect) {
                            ExperimentV5 a3 = a(experimentV53, uri);
                            if (a3 != null) {
                                arrayList.add(a3);
                            }
                        } else {
                            arrayList.add(experimentV53);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public ExperimentV5 a(long j) {
        List<ExperimentGroupV5> groups;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentV5) ipChange.ipc$dispatch("24783834", new Object[]{this, new Long(j)});
        }
        synchronized (this.c) {
            for (ExperimentV5 experimentV5 : this.b) {
                List<ExperimentGroupV5> groups2 = experimentV5.getGroups();
                if (groups2 != null) {
                    Iterator<ExperimentGroupV5> it = groups2.iterator();
                    while (it.hasNext()) {
                        if (it.next().getId() == j) {
                            return experimentV5;
                        }
                    }
                    continue;
                }
            }
            for (List<ExperimentV5> list : this.f4185a.values()) {
                if (list != null) {
                    for (ExperimentV5 experimentV52 : list) {
                        if (experimentV52 != null && (groups = experimentV52.getGroups()) != null) {
                            Iterator<ExperimentGroupV5> it2 = groups.iterator();
                            while (it2.hasNext()) {
                                if (it2.next().getId() == j) {
                                    return experimentV52;
                                }
                            }
                            continue;
                        }
                    }
                    continue;
                }
            }
            return null;
        }
    }

    private String a(Uri uri, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f7e1cdd7", new Object[]{this, uri, str});
        }
        String path = uri.getPath();
        return StringUtils.isEmpty(path) ? str : path;
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : StringUtils.indexOf(str, "UTABTEST-ANY") != -1;
    }

    public boolean a(Uri uri, Uri uri2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d711a94c", new Object[]{this, uri, uri2})).booleanValue();
        }
        String a2 = a(uri, "");
        String a3 = a(uri2, "");
        if (a(a2)) {
            String[] split = StringUtils.split(a2, "/");
            String[] split2 = StringUtils.split(a3, "/");
            if (split == null) {
                return false;
            }
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i < split.length && i3 < 50; i3++) {
                String str = split[i];
                String str2 = null;
                String str3 = (split2 == null || i2 >= split2.length) ? null : split2[i2];
                boolean equals = StringUtils.equals(str, "UTABTEST-ANY");
                if (str3 == null) {
                    if (equals) {
                        if (i == split.length - 1) {
                            return true;
                        }
                    } else if (StringUtils.isEmpty(str) && i == split.length - 1) {
                        return true;
                    } else {
                        if (!StringUtils.isEmpty(str)) {
                            return false;
                        }
                    }
                    i++;
                } else {
                    if (equals) {
                        int i4 = i + 1;
                        if (i4 < split.length) {
                            str2 = split[i4];
                        }
                        if (str2 != null && StringUtils.equals(str2, str3)) {
                            i += 2;
                        }
                    } else if (!StringUtils.equals(str, str3)) {
                        return false;
                    } else {
                        i++;
                    }
                    i2++;
                }
            }
            if (i2 >= split2.length - 1) {
                return true;
            }
            while (i2 < split2.length) {
                if (!StringUtils.isEmpty(split2[i2])) {
                    return false;
                }
                i2++;
            }
            return true;
        }
        return StringUtils.equals(a2, a3);
    }

    public boolean b(Uri uri, Uri uri2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a012a08d", new Object[]{this, uri, uri2})).booleanValue();
        }
        if (uri == uri2) {
            return true;
        }
        if (uri == null || uri2 == null || !a(uri, uri2)) {
            return false;
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames == null || queryParameterNames.isEmpty()) {
            return true;
        }
        if (!uri2.getQueryParameterNames().containsAll(queryParameterNames)) {
            return false;
        }
        for (String str : queryParameterNames) {
            String queryParameter = uri.getQueryParameter(str);
            if (!StringUtils.isEmpty(queryParameter) && !"UTABTEST-REG()UTABTEST-REG".equals(queryParameter)) {
                String queryParameter2 = uri2.getQueryParameter(str);
                if (!cex.a().j().C() || !b(queryParameter) || StringUtils.isEmpty(queryParameter2) || !queryParameter2.matches(c(queryParameter))) {
                    if (!StringUtils.equals(queryParameter, queryParameter2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue() : !StringUtils.isEmpty(str) && str.startsWith("UTABTEST-REG(") && str.endsWith(")UTABTEST-REG");
    }

    private String c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str}) : str.substring(13, str.length() - 13);
    }

    public final boolean a(cez<ExperimentV5> cezVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e34c6f84", new Object[]{this, cezVar})).booleanValue();
        }
        if (cezVar == null) {
            return false;
        }
        synchronized (this.d) {
            for (Map.Entry<String, List<ExperimentV5>> entry : this.f4185a.entrySet()) {
                List<ExperimentV5> value = entry.getValue();
                if (value != null && value.size() != 0) {
                    Iterator<ExperimentV5> it = value.iterator();
                    while (it.hasNext()) {
                        if (cezVar.test(it.next())) {
                            it.remove();
                            z = true;
                        }
                    }
                }
            }
        }
        synchronized (this.c) {
            Iterator<ExperimentV5> it2 = this.b.iterator();
            while (it2.hasNext()) {
                if (cezVar.test(it2.next())) {
                    it2.remove();
                    z = true;
                }
            }
        }
        return z;
    }
}
