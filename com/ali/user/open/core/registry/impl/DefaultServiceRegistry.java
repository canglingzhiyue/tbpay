package com.ali.user.open.core.registry.impl;

import com.ali.user.open.core.registry.ServiceRegistration;
import com.ali.user.open.core.registry.ServiceRegistry;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import tb.kge;

/* loaded from: classes2.dex */
public class DefaultServiceRegistry implements ServiceRegistry {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<Class<?>, List<ServiceEntry>> typeServiceEntries = new HashMap();
    private Map<ServiceRegistration, ServiceEntry> registrationServiceEntries = new HashMap();
    private ReadWriteLock lock = new ReentrantReadWriteLock();

    /* loaded from: classes2.dex */
    public static class ServiceEntry {
        public Object instance;
        public Map<String, String> properties;
        public Class<?>[] types;

        static {
            kge.a(1025151203);
        }
    }

    static {
        kge.a(286245086);
        kge.a(1845564752);
    }

    @Override // com.ali.user.open.core.registry.ServiceRegistry
    public ServiceRegistration registerService(Class<?>[] clsArr, Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ServiceRegistration) ipChange.ipc$dispatch("b40bb38d", new Object[]{this, clsArr, obj, map});
        }
        if (clsArr == null || clsArr.length == 0 || obj == null) {
            throw new IllegalArgumentException("service types and instance must not be null");
        }
        ServiceEntry serviceEntry = new ServiceEntry();
        serviceEntry.instance = obj;
        serviceEntry.types = clsArr;
        serviceEntry.properties = Collections.synchronizedMap(new HashMap());
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    serviceEntry.properties.put(entry.getKey(), entry.getValue());
                }
            }
        }
        this.lock.writeLock().lock();
        try {
            for (Class<?> cls : clsArr) {
                List<ServiceEntry> list = this.typeServiceEntries.get(cls);
                if (list == null) {
                    list = new ArrayList<>(2);
                    this.typeServiceEntries.put(cls, list);
                }
                list.add(serviceEntry);
            }
            InternalServiceRegistration internalServiceRegistration = new InternalServiceRegistration(this, serviceEntry.properties);
            this.registrationServiceEntries.put(internalServiceRegistration, serviceEntry);
            return internalServiceRegistration;
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b A[Catch: all -> 0x00ae, TryCatch #0 {all -> 0x00ae, blocks: (B:7:0x0022, B:9:0x002d, B:13:0x0036, B:16:0x003d, B:17:0x0041, B:19:0x0047, B:20:0x0055, B:22:0x005b, B:24:0x006f, B:29:0x007e, B:34:0x0098), top: B:40:0x0022 }] */
    @Override // com.ali.user.open.core.registry.ServiceRegistry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> T getService(java.lang.Class<T> r10, java.util.Map<java.lang.String, java.lang.String> r11) {
        /*
            r9 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.ali.user.open.core.registry.impl.DefaultServiceRegistry.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L19
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r9
            r1[r2] = r10
            r10 = 2
            r1[r10] = r11
            java.lang.String r10 = "53e3dec4"
            java.lang.Object r10 = r0.ipc$dispatch(r10, r1)
            return r10
        L19:
            java.util.concurrent.locks.ReadWriteLock r0 = r9.lock
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.lock()
            java.util.Map<java.lang.Class<?>, java.util.List<com.ali.user.open.core.registry.impl.DefaultServiceRegistry$ServiceEntry>> r0 = r9.typeServiceEntries     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r0 = r0.get(r10)     // Catch: java.lang.Throwable -> Lae
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> Lae
            r1 = 0
            if (r0 == 0) goto L8e
            int r4 = r0.size()     // Catch: java.lang.Throwable -> Lae
            if (r4 != 0) goto L34
            goto L8e
        L34:
            if (r11 == 0) goto L98
            int r4 = r11.size()     // Catch: java.lang.Throwable -> Lae
            if (r4 != 0) goto L3d
            goto L98
        L3d:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lae
        L41:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> Lae
            if (r4 == 0) goto L8e
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> Lae
            com.ali.user.open.core.registry.impl.DefaultServiceRegistry$ServiceEntry r4 = (com.ali.user.open.core.registry.impl.DefaultServiceRegistry.ServiceEntry) r4     // Catch: java.lang.Throwable -> Lae
            java.util.Set r5 = r11.entrySet()     // Catch: java.lang.Throwable -> Lae
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> Lae
        L55:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> Lae
            if (r6 == 0) goto L7b
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> Lae
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch: java.lang.Throwable -> Lae
            java.util.Map<java.lang.String, java.lang.String> r7 = r4.properties     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r8 = r6.getKey()     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r7 = r7.get(r8)     // Catch: java.lang.Throwable -> Lae
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> Lae
            if (r7 == 0) goto L79
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Throwable -> Lae
            boolean r6 = r7.equals(r6)     // Catch: java.lang.Throwable -> Lae
            if (r6 != 0) goto L55
        L79:
            r5 = 0
            goto L7c
        L7b:
            r5 = 1
        L7c:
            if (r5 == 0) goto L41
            java.lang.Object r11 = r4.instance     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r10 = r10.cast(r11)     // Catch: java.lang.Throwable -> Lae
            java.util.concurrent.locks.ReadWriteLock r11 = r9.lock
            java.util.concurrent.locks.Lock r11 = r11.readLock()
            r11.unlock()
            return r10
        L8e:
            java.util.concurrent.locks.ReadWriteLock r10 = r9.lock
            java.util.concurrent.locks.Lock r10 = r10.readLock()
            r10.unlock()
            return r1
        L98:
            java.lang.Object r11 = r0.get(r3)     // Catch: java.lang.Throwable -> Lae
            com.ali.user.open.core.registry.impl.DefaultServiceRegistry$ServiceEntry r11 = (com.ali.user.open.core.registry.impl.DefaultServiceRegistry.ServiceEntry) r11     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r11 = r11.instance     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r10 = r10.cast(r11)     // Catch: java.lang.Throwable -> Lae
            java.util.concurrent.locks.ReadWriteLock r11 = r9.lock
            java.util.concurrent.locks.Lock r11 = r11.readLock()
            r11.unlock()
            return r10
        Lae:
            r10 = move-exception
            java.util.concurrent.locks.ReadWriteLock r11 = r9.lock
            java.util.concurrent.locks.Lock r11 = r11.readLock()
            r11.unlock()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.open.core.registry.impl.DefaultServiceRegistry.getService(java.lang.Class, java.util.Map):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066 A[Catch: all -> 0x00e6, TryCatch #0 {all -> 0x00e6, blocks: (B:7:0x0024, B:9:0x002e, B:13:0x0038, B:16:0x003f, B:17:0x004c, B:19:0x0052, B:20:0x0060, B:22:0x0066, B:24:0x007a, B:29:0x0089, B:30:0x0093, B:33:0x00ab, B:35:0x00bb, B:39:0x00d6), top: B:45:0x0024 }] */
    @Override // com.ali.user.open.core.registry.ServiceRegistry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> T[] getServices(java.lang.Class<T> r10, java.util.Map<java.lang.String, java.lang.String> r11) {
        /*
            r9 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.ali.user.open.core.registry.impl.DefaultServiceRegistry.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1b
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r9
            r1[r2] = r10
            r10 = 2
            r1[r10] = r11
            java.lang.String r10 = "71717aa4"
            java.lang.Object r10 = r0.ipc$dispatch(r10, r1)
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            return r10
        L1b:
            java.util.concurrent.locks.ReadWriteLock r0 = r9.lock
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.lock()
            java.util.Map<java.lang.Class<?>, java.util.List<com.ali.user.open.core.registry.impl.DefaultServiceRegistry$ServiceEntry>> r0 = r9.typeServiceEntries     // Catch: java.lang.Throwable -> Le6
            java.lang.Object r0 = r0.get(r10)     // Catch: java.lang.Throwable -> Le6
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> Le6
            if (r0 == 0) goto Ld6
            int r1 = r0.size()     // Catch: java.lang.Throwable -> Le6
            if (r1 != 0) goto L36
            goto Ld6
        L36:
            if (r11 == 0) goto Lab
            int r1 = r11.size()     // Catch: java.lang.Throwable -> Le6
            if (r1 != 0) goto L3f
            goto Lab
        L3f:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Le6
            int r4 = r0.size()     // Catch: java.lang.Throwable -> Le6
            r1.<init>(r4)     // Catch: java.lang.Throwable -> Le6
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Le6
        L4c:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> Le6
            if (r4 == 0) goto L93
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> Le6
            com.ali.user.open.core.registry.impl.DefaultServiceRegistry$ServiceEntry r4 = (com.ali.user.open.core.registry.impl.DefaultServiceRegistry.ServiceEntry) r4     // Catch: java.lang.Throwable -> Le6
            java.util.Set r5 = r11.entrySet()     // Catch: java.lang.Throwable -> Le6
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> Le6
        L60:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> Le6
            if (r6 == 0) goto L86
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> Le6
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch: java.lang.Throwable -> Le6
            java.util.Map<java.lang.String, java.lang.String> r7 = r4.properties     // Catch: java.lang.Throwable -> Le6
            java.lang.Object r8 = r6.getKey()     // Catch: java.lang.Throwable -> Le6
            java.lang.Object r7 = r7.get(r8)     // Catch: java.lang.Throwable -> Le6
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> Le6
            if (r7 == 0) goto L84
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Throwable -> Le6
            boolean r6 = r7.equals(r6)     // Catch: java.lang.Throwable -> Le6
            if (r6 != 0) goto L60
        L84:
            r5 = 0
            goto L87
        L86:
            r5 = 1
        L87:
            if (r5 == 0) goto L4c
            java.lang.Object r4 = r4.instance     // Catch: java.lang.Throwable -> Le6
            java.lang.Object r4 = r10.cast(r4)     // Catch: java.lang.Throwable -> Le6
            r1.add(r4)     // Catch: java.lang.Throwable -> Le6
            goto L4c
        L93:
            int r11 = r1.size()     // Catch: java.lang.Throwable -> Le6
            java.lang.Object r10 = java.lang.reflect.Array.newInstance(r10, r11)     // Catch: java.lang.Throwable -> Le6
            java.lang.Object[] r10 = (java.lang.Object[]) r10     // Catch: java.lang.Throwable -> Le6
            java.lang.Object[] r10 = r1.toArray(r10)     // Catch: java.lang.Throwable -> Le6
            java.util.concurrent.locks.ReadWriteLock r11 = r9.lock
            java.util.concurrent.locks.Lock r11 = r11.readLock()
            r11.unlock()
            return r10
        Lab:
            int r11 = r0.size()     // Catch: java.lang.Throwable -> Le6
            java.lang.Object r11 = java.lang.reflect.Array.newInstance(r10, r11)     // Catch: java.lang.Throwable -> Le6
            java.lang.Object[] r11 = (java.lang.Object[]) r11     // Catch: java.lang.Throwable -> Le6
            int r1 = r0.size()     // Catch: java.lang.Throwable -> Le6
        Lb9:
            if (r3 >= r1) goto Lcc
            java.lang.Object r2 = r0.get(r3)     // Catch: java.lang.Throwable -> Le6
            com.ali.user.open.core.registry.impl.DefaultServiceRegistry$ServiceEntry r2 = (com.ali.user.open.core.registry.impl.DefaultServiceRegistry.ServiceEntry) r2     // Catch: java.lang.Throwable -> Le6
            java.lang.Object r2 = r2.instance     // Catch: java.lang.Throwable -> Le6
            java.lang.Object r2 = r10.cast(r2)     // Catch: java.lang.Throwable -> Le6
            r11[r3] = r2     // Catch: java.lang.Throwable -> Le6
            int r3 = r3 + 1
            goto Lb9
        Lcc:
            java.util.concurrent.locks.ReadWriteLock r10 = r9.lock
            java.util.concurrent.locks.Lock r10 = r10.readLock()
            r10.unlock()
            return r11
        Ld6:
            java.lang.Object r10 = java.lang.reflect.Array.newInstance(r10, r3)     // Catch: java.lang.Throwable -> Le6
            java.lang.Object[] r10 = (java.lang.Object[]) r10     // Catch: java.lang.Throwable -> Le6
            java.util.concurrent.locks.ReadWriteLock r11 = r9.lock
            java.util.concurrent.locks.Lock r11 = r11.readLock()
            r11.unlock()
            return r10
        Le6:
            r10 = move-exception
            java.util.concurrent.locks.ReadWriteLock r11 = r9.lock
            java.util.concurrent.locks.Lock r11 = r11.readLock()
            r11.unlock()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.open.core.registry.impl.DefaultServiceRegistry.getServices(java.lang.Class, java.util.Map):java.lang.Object[]");
    }

    @Override // com.ali.user.open.core.registry.ServiceRegistry
    public Object unregisterService(ServiceRegistration serviceRegistration) {
        Class<?>[] clsArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("dd33253d", new Object[]{this, serviceRegistration});
        }
        if (serviceRegistration == null) {
            return null;
        }
        this.lock.writeLock().lock();
        try {
            ServiceEntry remove = this.registrationServiceEntries.remove(serviceRegistration);
            if (remove == null) {
                return null;
            }
            if (remove.types != null) {
                for (Class<?> cls : remove.types) {
                    List<ServiceEntry> list = this.typeServiceEntries.get(cls);
                    Iterator<ServiceEntry> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (it.next() == remove) {
                            it.remove();
                            break;
                        }
                    }
                    if (list.size() == 0) {
                        this.typeServiceEntries.remove(cls);
                    }
                }
            }
            return remove.instance;
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    /* loaded from: classes2.dex */
    public static class InternalServiceRegistration implements ServiceRegistration {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Map<String, String> properties;
        private ServiceRegistry serviceRegistry;
        private final String uuid = UUID.randomUUID().toString();

        static {
            kge.a(-2083128533);
            kge.a(-1329984436);
        }

        public InternalServiceRegistration(ServiceRegistry serviceRegistry, Map<String, String> map) {
            this.serviceRegistry = serviceRegistry;
            this.properties = map;
        }

        @Override // com.ali.user.open.core.registry.ServiceRegistration
        public void setProperties(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5217c6c9", new Object[]{this, map});
            } else if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (entry.getKey() != null && entry.getValue() != null) {
                        this.properties.put(entry.getKey(), entry.getValue());
                    }
                }
            }
        }

        @Override // com.ali.user.open.core.registry.ServiceRegistration
        public void unregister() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("50cd9ac3", new Object[]{this});
            } else {
                this.serviceRegistry.unregisterService(this);
            }
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            String str = this.uuid;
            if (str != null) {
                i = str.hashCode();
            }
            return 31 + i;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.uuid.equals(((InternalServiceRegistration) obj).uuid);
        }
    }
}
