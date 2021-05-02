package inc.blackhorse.pmmi;

import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED)
public interface SetObjectMapper {

    SetObjectMapper INSTANCE = Mappers.getMapper(SetObjectMapper.class);

    @Mapping(target = "set1", source = "set1")
    @Mapping(target = "set2", source = "set2")
    SetsHolder toGrpc(SetsHolderModel model);
}
