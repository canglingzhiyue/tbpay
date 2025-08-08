package com.taobao.android.cachecleaner.autoclear.biz;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.CacheCleaner;
import com.taobao.tao.log.TLog;
import tb.kge;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(674406168);
    }

    public static boolean a(String str, String str2) {
        String str3;
        String substring;
        String format;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (StringUtils.isEmpty(str) || "*".equals(str) || "-".equals(str)) {
            return true;
        }
        try {
            a aVar = new a(str2);
            if (str.contains("|")) {
                try {
                    int indexOf = str.indexOf("|");
                    substring = str.substring(0, indexOf);
                    String substring2 = str.substring(indexOf + 1);
                    String[] split = substring2.split(",");
                    if (split.length > 0) {
                        for (String str4 : split) {
                            if (!StringUtils.isEmpty(str4)) {
                                try {
                                    if (new a(str4).equals(aVar)) {
                                        return false;
                                    }
                                } catch (IllegalArgumentException unused) {
                                    TLog.loge(CacheCleaner.MODULE, "ConditionVerChecker", "checkVersion: check exclude version with IllegalArgumentException, exclude version config is " + substring2);
                                    return false;
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    str3 = String.format("checkVersion: witch exception %s, config is %s, curVersion is %s", th.toString(), str, str2);
                    TLog.loge(CacheCleaner.MODULE, "ConditionVerChecker", str3);
                    return false;
                }
            } else {
                substring = str;
            }
            if (StringUtils.isEmpty(substring)) {
                return true;
            }
            if (!substring.contains("-")) {
                String[] split2 = substring.split(",");
                if (split2.length <= 0) {
                    return false;
                }
                for (String str5 : split2) {
                    try {
                    } catch (IllegalArgumentException unused2) {
                        TLog.loge(CacheCleaner.MODULE, "ConditionVerChecker", String.format("checkVersion: check with IllegalArgumentException, version config is %s, cur version is %s.", str, str2));
                    }
                    if (new a(str5).equals(aVar)) {
                        return true;
                    }
                }
            } else {
                String[] split3 = substring.split("-");
                if (substring.endsWith("-") && split3.length == 1) {
                    try {
                        return aVar.a(new a(split3[0])) >= 0;
                    } catch (IllegalArgumentException unused3) {
                        format = String.format("checkVersion: check with IllegalArgumentException, version config is %s, cur version is %s.", str, str2);
                    }
                } else if (substring.startsWith("-") && split3.length == 2) {
                    try {
                        return aVar.a(new a(split3[1])) <= 0;
                    } catch (IllegalArgumentException unused4) {
                        format = String.format("checkVersion: check with IllegalArgumentException, version config is %s, cur version is %s.", str, str2);
                    }
                } else if (split3.length == 2) {
                    try {
                        a aVar2 = new a(split3[0]);
                        a aVar3 = new a(split3[1]);
                        if (aVar2.a(aVar3) <= 0 && aVar.a(aVar3) <= 0) {
                            if (aVar.a(aVar2) >= 0) {
                                return true;
                            }
                        }
                        return false;
                    } catch (IllegalArgumentException unused5) {
                        format = String.format("checkVersion: check with IllegalArgumentException, version config is %s, cur version is %s.", str, str2);
                    }
                }
                TLog.loge(CacheCleaner.MODULE, "ConditionVerChecker", format);
            }
            return false;
        } catch (IllegalArgumentException unused6) {
            str3 = "checkVersion: init VersionComparable with IllegalArgumentException, current version is " + str2;
        }
    }

    /* loaded from: classes4.dex */
    public static class a implements Comparable<a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f9279a;

        static {
            kge.a(-111417050);
            kge.a(415966670);
        }

        @Override // java.lang.Comparable
        public /* synthetic */ int compareTo(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a4672d6", new Object[]{this, aVar})).intValue() : a(aVar);
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f9279a;
        }

        public a(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Version can not be null");
            }
            if (!str.matches("[0-9]+(\\.[0-9]+)*")) {
                throw new IllegalArgumentException("Invalid version format");
            }
            this.f9279a = str;
        }

        public int a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e5616a1", new Object[]{this, aVar})).intValue();
            }
            if (aVar == null) {
                return 1;
            }
            String[] split = a().split("\\.");
            String[] split2 = aVar.a().split("\\.");
            int max = Math.max(split.length, split2.length);
            int i = 0;
            while (i < max) {
                int parseInt = i < split.length ? Integer.parseInt(split[i]) : 0;
                int parseInt2 = i < split2.length ? Integer.parseInt(split2[i]) : 0;
                if (parseInt < parseInt2) {
                    return -1;
                }
                if (parseInt > parseInt2) {
                    return 1;
                }
                i++;
            }
            return 0;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && a((a) obj) == 0;
        }
    }
}
