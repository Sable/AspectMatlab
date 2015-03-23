function [time, output, valid] = drv_fft(scale)
%Driver for fast fourier transform
%input is n randomly generated complex numbers stored in an array of size 2*n
%n must be a power of 2
% transf = fft_four1(data,n,1) computes forward transform
% 1/n * fft_four1(transf,n,-1) computes backward tranform

n = 1024*1024*2^round(log2(scale));
data = rand(1,2*n);

'computing the forward transform'

t1 = clock;

out = fft_four1(data,n,1);

t2 = clock;

% Compute the running time in seconds
time = (t2-t1)*[0 0 86400 3600 60 1]';

% Store the benchmark output
output = {mean(out(:))};

% No validation performed
valid = 'N/A';

end
