package gl51.service.impl

import gl51.data.Ip
import gl51.service.IPService
import gl51.service.IpConverterService

import javax.inject.Inject

class BinaryConverterServiceImpl implements IpConverterService{
    /**
     * attribute
     */
    @Inject
    IPService service

    /**
     * Because in IpConverterService we have the a function with the same name
     * @return
     */
    @Override
    String getAndConvertIp() {
        Ip ip = service.fetchIp()
        ///
    }
}
