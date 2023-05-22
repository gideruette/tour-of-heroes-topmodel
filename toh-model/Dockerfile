FROM mcr.microsoft.com/dotnet/sdk:6.0
RUN dotnet tool install --global TopModel.Generator --version 1.30.2
ENV PATH="${PATH}:/root/.dotnet/tools"
ENTRYPOINT [ "modgen" ]