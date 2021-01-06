Your configuration must be designed to identify the CAS server.

```properties
# cas.server.name=https://cas.example.org:8443
# cas.server.prefix=https://cas.example.org:8443/cas 
# cas.server.scope=example.org
# cas.host.name=
```

A CAS host is automatically appended to the ticket ids generated by CAS.
If none is specified, one is automatically detected and used by CAS.

On startup, CAS will display a banner along with some diagnostics info.
In order to skip this step and summarize, set the system property `-DCAS_BANNER_SKIP=true`.

CAS may also be conditionally configured to report, as part of the
banner, whether a newer CAS release is available for an upgrade.
This check is off by default and may be enabled with a system property of `-DCAS_UPDATE_CHECK_ENABLED=true`.
