package com.alipay.mobile.common.logging.helper;

import android.content.Context;
import com.alipay.mobile.common.logging.api.DeviceHWInfo;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class YearClass {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile Integer f5440a;

    public static int a(Context context) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        if (f5440a == null) {
            synchronized (YearClass.class) {
                if (f5440a == null) {
                    long totalMemory = DeviceHWInfo.getTotalMemory(context);
                    if (totalMemory == -1) {
                        ArrayList arrayList = new ArrayList();
                        int numberOfCPUCores = DeviceHWInfo.getNumberOfCPUCores();
                        a(arrayList, numberOfCPUCores <= 0 ? -1 : numberOfCPUCores == 1 ? 2008 : numberOfCPUCores <= 3 ? 2011 : 2012);
                        long cPUMaxFreqKHz = DeviceHWInfo.getCPUMaxFreqKHz();
                        a(arrayList, cPUMaxFreqKHz == -1 ? -1 : cPUMaxFreqKHz <= 528000 ? 2008 : cPUMaxFreqKHz <= 620000 ? 2009 : cPUMaxFreqKHz <= 1020000 ? 2010 : cPUMaxFreqKHz <= 1220000 ? 2011 : cPUMaxFreqKHz <= 1520000 ? 2012 : cPUMaxFreqKHz <= 2020000 ? 2013 : 2014);
                        long totalMemory2 = DeviceHWInfo.getTotalMemory(context);
                        a(arrayList, totalMemory2 <= 0 ? -1 : totalMemory2 <= 201326592 ? 2008 : totalMemory2 <= 304087040 ? 2009 : totalMemory2 <= 536870912 ? 2010 : totalMemory2 <= 1073741824 ? 2011 : totalMemory2 <= 1610612736 ? 2012 : totalMemory2 <= 2147483648L ? 2013 : 2014);
                        if (arrayList.isEmpty()) {
                            i = -1;
                        } else {
                            Collections.sort(arrayList);
                            if ((arrayList.size() & 1) == 1) {
                                i = ((Integer) arrayList.get(arrayList.size() / 2)).intValue();
                            } else {
                                int size = (arrayList.size() / 2) - 1;
                                i = ((Integer) arrayList.get(size)).intValue() + ((((Integer) arrayList.get(size + 1)).intValue() - ((Integer) arrayList.get(size)).intValue()) / 2);
                            }
                        }
                    } else if (totalMemory <= 805306368) {
                        i = DeviceHWInfo.getNumberOfCPUCores() <= 1 ? 2009 : 2010;
                    } else if (totalMemory <= 1073741824) {
                        if (DeviceHWInfo.getCPUMaxFreqKHz() < 1300000) {
                            i = 2011;
                        }
                        i = 2012;
                    } else {
                        if (totalMemory <= 1610612736) {
                            if (DeviceHWInfo.getCPUMaxFreqKHz() < 1800000) {
                                i = 2012;
                            }
                        } else if (totalMemory > 2147483648L) {
                            i = totalMemory <= 3221225472L ? 2014 : 2015;
                        }
                        i = 2013;
                    }
                    f5440a = Integer.valueOf(i);
                }
            }
        }
        return f5440a.intValue();
    }

    private static void a(ArrayList<Integer> arrayList, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1640bd01", new Object[]{arrayList, new Integer(i)});
        } else if (i == -1) {
        } else {
            arrayList.add(Integer.valueOf(i));
        }
    }
}
